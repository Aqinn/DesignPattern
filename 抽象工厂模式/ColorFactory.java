package 抽象工厂模式;

/**
 * @Author Aqinn
 * @Date 2021/3/10 3:53 下午
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;
        if ("red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("green".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

}
