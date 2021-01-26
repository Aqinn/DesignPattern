package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 7:51 上午
 * 缺点：第一次加载时反应稍慢，每次调用 getInstance 都进行同步，造成不必要的同步开销，这种模式一般不建议使用。
 */
public class LazyMan_Safe {  // 同步的懒汉式（线程安全，可用，不建议使用）

    private static LazyMan_Safe sSingleton;

    private LazyMan_Safe() {

    }

    private synchronized static LazyMan_Safe getInstance() {
        if (sSingleton == null)
            sSingleton = new LazyMan_Safe();
        return sSingleton;
    }

}
