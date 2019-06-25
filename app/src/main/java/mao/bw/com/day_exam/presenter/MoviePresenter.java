package mao.bw.com.day_exam.presenter;

import io.reactivex.Observable;
import mao.bw.com.day_exam.base.BasePresenter;
import mao.bw.com.day_exam.core.DataCall;
import mao.bw.com.day_exam.model.IRequest;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/9 16:25:35
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
