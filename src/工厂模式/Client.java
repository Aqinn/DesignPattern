package 工厂模式;

/**
 * @Author Aqinn
 * @Date 2020/12/15 7:59 上午
 */
public class Client {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape shape1 = sf.getShape("circle");
        shape1.draw();
        Shape shape2 = sf.getShape("square");
        shape2.draw();
        Shape shape3 = sf.getShape("rectangle");
        shape3.draw();
    }

}
