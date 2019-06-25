package mao.bw.com.day_exam.model;

import java.util.List;

import io.reactivex.Observable;
import mao.bw.com.day_exam.bean.MovieBean;
import mao.bw.com.day_exam.bean.Result;
import retrofit2.http.GET;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/9 16:20:04
 * @Description: 描述信息
 */
public interface IRequest {
    @GET("findReleaseMovieList?page=1&count=20")
    Observable<Result<List<MovieBean>>>findReleaseMovieList();
}
