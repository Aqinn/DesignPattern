package 迭代器模式;

import java.util.ArrayList;

/**
 * @Author Aqinn
 * @Date 2020/11/15 11:30 上午
 */
public class Client {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }

}
