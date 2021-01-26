package 建造者模式.第一种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 8:58 下午
 */
public class Director {

    public Product create(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

}
