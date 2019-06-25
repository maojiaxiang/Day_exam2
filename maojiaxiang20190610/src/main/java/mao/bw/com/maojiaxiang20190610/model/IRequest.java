package mao.bw.com.maojiaxiang20190610.model;

import java.util.List;

import io.reactivex.Observable;
import mao.bw.com.maojiaxiang20190610.bean.MovieBean;
import mao.bw.com.maojiaxiang20190610.bean.Result;
import retrofit2.http.GET;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/10 09:00:11
 * @Description: 描述信息
 */
public interface IRequest {
    @GET("findHotMovieList?page=1&count=10")
    Observable<Result<List<MovieBean>>>findHotMovieList();
}
