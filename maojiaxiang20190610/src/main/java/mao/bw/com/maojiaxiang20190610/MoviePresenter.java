package mao.bw.com.maojiaxiang20190610;

import io.reactivex.Observable;
import mao.bw.com.maojiaxiang20190610.base.BasePresenter;
import mao.bw.com.maojiaxiang20190610.core.DataCall;
import mao.bw.com.maojiaxiang20190610.model.IRequest;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/10 09:08:54
 * @Description: 描述信息
 */
public class MoviePresenter extends BasePresenter{
    public MoviePresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(IRequest iRequest, Object... args) {
        return iRequest.findHotMovieList();
    }
}
