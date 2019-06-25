package mao.bw.com.maojiaxiang20190610.core;

import mao.bw.com.maojiaxiang20190610.bean.Result;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/10 08:59:07
 * @Description: 描述信息
 */
public interface DataCall<T> {
    void onSuccess(T result,Object...args);
    void fail(Result result,Object...args);
}
