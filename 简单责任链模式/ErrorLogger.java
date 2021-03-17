package 简单责任链模式;

/**
 * @Author Aqinn
 * @Date 2021/3/16 10:58 上午
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("Error :: " + msg);
    }

}
