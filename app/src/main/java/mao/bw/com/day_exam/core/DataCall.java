package mao.bw.com.day_exam.core;

import mao.bw.com.day_exam.bean.Result;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/9 16:18:54
 * @Description: 描述信息
 */
public interface DataCall<T> {
    void onSuccess(T result,Object...args);
    void fail(Result result,Object...args);
}
