package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 7:50 上午
 * 缺点：第一次第一次加载时反应稍慢，线程不安全。
 */
public class LazyMan_Unsafe {  // 懒汉式（线程不安全，并发场景不可用）

    private static LazyMan_Unsafe sSingleton;

    private LazyMan_Unsafe() {

    }

    public static LazyMan_Unsafe getInstance() {
        if (sSingleton == null)
            sSingleton = new LazyMan_Unsafe();
        return sSingleton;
    }

}
