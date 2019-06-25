package mao.bw.com.maojiaxiang20190624.core;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 09:00:21
 * @Description: 描述信息
 */
public interface DataCall<T> {
    void success(T result,Object...args);
    void fail(T data,Object...args);
}
