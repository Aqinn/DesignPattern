package 抽象工厂模式;

/**
 * @Author Aqinn
 * @Date 2021/3/10 3:55 下午
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }
        return null;
    }

}
