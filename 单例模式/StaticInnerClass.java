package 单例模式;

/**
 * @Author Aqinn
 * @Date 2021/1/26 8:01 上午
 */
public class StaticInnerClass {  // 静态内部类（线程安全，推荐使用）

    private static class Singleton {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    private StaticInnerClass() {

    }

    public static StaticInnerClass getInstance() {
        return Singleton.INSTANCE;
    }

}
