package OkHttp责任链模式.五大拦截器;

import OkHttp责任链模式.Interceptor;
import OkHttp责任链模式.Request;
import OkHttp责任链模式.Response;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:14 上午
 */
public class RetryAndFollowUpInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        request.log.add("1 :: RetryAndFollowUpInterceptor");
        Response response = chain.proceed(request);
        response.log.add("2 :: RetryAndFollowUpInterceptor");
        return response;
    }

}
