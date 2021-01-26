package 建造者模式.第二种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 9:05 下午
 */
public class ABuilder extends Builder {

    private Product product;
    public ABuilder() {
        product = new Product();
    }

    @Override
    Builder buildA(String mes) {
        product.setBuildA(mes);
        return this;
    }

    @Override
    Builder buildB(String mes) {
        product.setBuildB(mes);
        return this;
    }

    @Override
    Builder buildC(String mes) {
        product.setBuildC(mes);
        return this;
    }

    @Override
    Builder buildD(String mes) {
        product.setBuildD(mes);
        return this;
    }

    @Override
    Product build() {
        return product;
    }
}
