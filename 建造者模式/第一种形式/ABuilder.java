package 建造者模式.第一种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 8:56 下午
 */
public class ABuilder extends Builder {

    private Product product;

    public ABuilder() {
        this.product = new Product();
    }

    @Override
    void buildA() {
        this.product.setBuildA("ABuilder.buildA()");
    }

    @Override
    void buildB() {
        this.product.setBuildB("ABuilder.buildB()");
    }

    @Override
    void buildC() {
        this.product.setBuildC("ABuilder.buildC()");
    }

    @Override
    void buildD() {
        this.product.setBuildD("ABuilder.buildD()");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
