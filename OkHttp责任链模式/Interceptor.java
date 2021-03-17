package OkHttp责任链模式;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:05 上午
 */
public interface Interceptor {

    Response intercept(Chain chain);

    interface Chain {

        Response proceed(Request request);

        Request request();

    }

}
