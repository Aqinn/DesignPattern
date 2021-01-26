package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 8:10 上午
 * 将实例对象用 public static final 修饰，不提供公开方法获取实例，直接通过 Singleton.sSingleton 获取。
 * 缺点：与饿汉式一样，类一加载的时候，就实例化，提前占用了系统资源。
 */
public class Const {  // 常量式（线程安全，可用）

    public static final Const INSTANCE = new Const();

    private Const() {

    }

}
