package 抽象工厂模式;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author Aqinn
 * @Date 2021/3/10 2:47 下午
 */
public class Client {

    /**
     * 抽象工厂模式描述:
     * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
     */

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        assert shapeFactory != null;
        Shape s1 = shapeFactory.getShape("square");
        s1.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        assert colorFactory != null;
        Color c1 = colorFactory.getColor("red");
        c1.fill();
    }

}
