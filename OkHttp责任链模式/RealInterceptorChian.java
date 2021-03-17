package OkHttp责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aqinn
 * @Date 2021/3/16 11:23 上午
 */
public class RealInterceptorChian implements Interceptor.Chain {

    private List<Interceptor> interceptors;
    private int idx;
    private final int size;
    private Request request;

    public RealInterceptorChian(List<Interceptor> interceptors, Request request, int idx) {
        this.interceptors = new ArrayList<>();
        this.interceptors.addAll(interceptors);
        this.idx = idx;
        this.size = this.interceptors.size();
        this.request = request;
    }

    @Override
    public Response proceed(Request request) {
        if (idx >= size)
            return null;
//        RealInterceptorChian next = new RealInterceptorChian(interceptors, request, idx + 1);
        Interceptor interceptor = interceptors.get(idx);
        idx++;
        Response response = interceptor.intercept(this);
        return response;
    }

    @Override
    public Request request() {
        return request;
    }

}
