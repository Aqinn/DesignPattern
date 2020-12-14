package 建造者模式.第一种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 8:52 下午
 */
public abstract class Builder {

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProduct();

}
