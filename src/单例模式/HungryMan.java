package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 7:47 上午
 * 缺点： 类一加载的时候，就实例化，提前占用了系统资源。
 */
public class HungryMan {  // 饿汉式（线程安全，可用）

    private static HungryMan sSingleton = new HungryMan();

    private HungryMan() {

    }

    public static HungryMan getInstance() {
        return sSingleton;
    }

}
