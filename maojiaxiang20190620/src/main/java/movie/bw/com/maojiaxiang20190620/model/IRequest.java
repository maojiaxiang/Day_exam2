package movie.bw.com.maojiaxiang20190620.model;

import java.util.List;

import io.reactivex.Observable;
import movie.bw.com.maojiaxiang20190620.bean.MovieBean;
import movie.bw.com.maojiaxiang20190620.bean.Result;
import retrofit2.http.GET;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/20 08:59:17
 * @Description: 描述信息
 */
public interface IRequest {
    @GET("findReleaseMovieList?page=1&count=5")
    Observable<Result<List<MovieBean>>>findReleaseMovieList();
}
