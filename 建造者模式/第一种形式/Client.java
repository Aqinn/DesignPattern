package 建造者模式.第一种形式;

import 建造者模式.第一种形式.ABuilder;
import 建造者模式.第一种形式.Director;
import 建造者模式.第一种形式.Product;

/**
 * @Author Aqinn
 * @Date 2020/12/14 8:59 下午
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product create = director.create(new ABuilder());
        System.out.println(create.toString());
    }

}
