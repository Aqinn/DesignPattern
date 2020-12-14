package 建造者模式.第二种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 9:02 下午
 */
public abstract class Builder {

    abstract Builder buildA(String mes);

    abstract Builder buildB(String mes);

    abstract Builder buildC(String mes);

    abstract Builder buildD(String mes);

    abstract Product build();

}
