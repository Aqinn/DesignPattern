package OkHttp责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:10 上午
 */
public class Request {

    public List<String> log = new ArrayList<>();

    public void show() {
        for (String str : log) {
            System.out.println(str);
        }
    }

}
