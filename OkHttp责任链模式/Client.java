package OkHttp责任链模式;

import OkHttp责任链模式.五大拦截器.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:42 上午
 */
public class Client {

    public static void main(String[] args) {
        List<Interceptor> list = new ArrayList<>();
        list.add(new RetryAndFollowUpInterceptor());
        list.add(new BridgeInterceptor());
        list.add(new CacheInterceptor());
        list.add(new ConnnectionInterceptor());
        list.add(new CallServerInterceptor());
        Request request = new Request();
        Interceptor.Chain chain = new RealInterceptorChian(list, request, 0);
        Response response = chain.proceed(request);
        request.show();
        response.show();
    }

}
