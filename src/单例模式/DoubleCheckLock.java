package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 7:57 上午
 * 优点：资源利用率高，第一次执行getInstance时单例对象才会被实例化，效率高。
 * 缺点：第一次加载时反应稍慢，也由于Java内存模型的原因偶尔会失败。
 *      在高并发环境下也有一定的缺陷，虽然发生的概率很小。
 *      DCL模式是使用最多的单例实现方式，它能够在需要时才实例化单例对象，并且能够在绝大多数场景下保证单例对象的唯一性，
 *      除非你的代码在并发场景比较复杂或者低于jdk1.6版本下使用，否则这种方式一般能够满足需求。
 */
public class DoubleCheckLock {  // 双重检查锁 DCL (线程安全，大多数场景满足需求，推荐使用)

    private static volatile DoubleCheckLock sSingleton;

    private DoubleCheckLock() {

    }

    private static DoubleCheckLock getInstance() {
        if (sSingleton == null) {
            synchronized (DoubleCheckLock.class) {
                if (sSingleton == null) {
                    sSingleton = new DoubleCheckLock();
                }
            }
        }
        return sSingleton;
    }

}
