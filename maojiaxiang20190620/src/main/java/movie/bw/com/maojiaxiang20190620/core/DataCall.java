package movie.bw.com.maojiaxiang20190620.core;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/20 08:58:30
 * @Description: 描述信息
 */
public interface DataCall<T> {
    void onSuccess(T result,Object...args);
    void fail(T data,Object...args);
}
