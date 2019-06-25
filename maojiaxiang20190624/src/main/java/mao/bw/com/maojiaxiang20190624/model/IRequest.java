package mao.bw.com.maojiaxiang20190624.model;

import java.util.List;

import io.reactivex.Observable;
import mao.bw.com.maojiaxiang20190624.bean.GoodsBean;
import mao.bw.com.maojiaxiang20190624.bean.Result;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 08:55:48
 * @Description: 描述信息
 */
public interface IRequest {
    @GET("commodity/v1/findCommodityByKeyword?page=1&count=5")
    Observable<Result<List<GoodsBean>>>findCommodityByKeyword(@Query("keyword")String keyword);
}
