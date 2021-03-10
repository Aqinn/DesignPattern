package 抽象工厂模式;

/**
 * @Author Aqinn
 * @Date 2021/3/10 3:50 下午
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
