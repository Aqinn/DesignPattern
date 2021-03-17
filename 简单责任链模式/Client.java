package 简单责任链模式;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:00 上午
 */
public class Client {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chain = getChainOfLoggers();
        chain.logMsg(AbstractLogger.INFO, "这是一条 INFO 级别的信息");
        chain.logMsg(AbstractLogger.DEBUG, "这是一条 DEBUG 级别的信息");
        chain.logMsg(AbstractLogger.ERROR, "这是一条 ERROR 级别的信息");
    }

}
