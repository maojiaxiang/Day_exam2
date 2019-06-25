package mao.bw.com.maojiaxiang20190624.presenter;

import io.reactivex.Observable;
import mao.bw.com.maojiaxiang20190624.core.DataCall;
import mao.bw.com.maojiaxiang20190624.model.IRequest;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 09:04:07
 * @Description: 描述信息
 */
public class Presenter extends BasePresenter{
    public Presenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable getModel(IRequest iRequest, Object... args) {
        return iRequest.findCommodityByKeyword((String)args[0]);
    }
}
