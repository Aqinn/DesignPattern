package 建造者模式.第二种形式;

/**
 * @Author Aqinn
 * @Date 2020/12/14 9:09 下午
 */
public class Client {

    public static void main(String[] args) {
        ABuilder builder = new ABuilder();
        Product build = builder
                .buildA("牛肉煲")
//              .buildC("全家桶")
                .buildD("冰淇淋")
                .build();
        System.out.println(build.toString());
    }

}
