package 抽象工厂模式;

/**
 * @Author Aqinn
 * @Date 2021/3/10 3:48 下午
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

}
