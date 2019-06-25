package movie.bw.com.maojiaxiang20190620.presenter;

import io.reactivex.Observable;
import movie.bw.com.maojiaxiang20190620.base.BasePresenter;
import movie.bw.com.maojiaxiang20190620.core.DataCall;
import movie.bw.com.maojiaxiang20190620.model.IRequest;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/20 09:03:14
 * @Description: 描述信息
 */
public class MoviePresenter extends BasePresenter {
    public MoviePresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(IRequest iRequest, Object... args) {
        return iRequest.findReleaseMovieList();
    }
}
