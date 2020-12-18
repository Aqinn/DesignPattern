package 观察者模式;

/**
 * @Author Aqinn
 * @Date 2020/12/18 9:53 上午
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
