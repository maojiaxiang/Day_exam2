package mao.bw.com.maojiaxiang20190624.presenter;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import mao.bw.com.maojiaxiang20190624.bean.Result;
import mao.bw.com.maojiaxiang20190624.core.DataCall;
import mao.bw.com.maojiaxiang20190624.model.IRequest;
import mao.bw.com.maojiaxiang20190624.util.HttpUtil;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 09:00:02
 * @Description: 描述信息
 */
public abstract class BasePresenter {
    private DataCall dataCall;

    public BasePresenter(DataCall dataCall) {
        this.dataCall = dataCall;
    }
    public void requestData(Object...args){
        IRequest iRequest = HttpUtil.getInstance().create(IRequest.class);
        getModel(iRequest,args)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Result>() {
                    @Override
                    public void accept(Result o) throws Exception {
                        if (o.status.equals("0000")){
                            dataCall.success(o.result);
                        }
                    }
                });
    }
    protected abstract Observable getModel(IRequest iRequest,Object...args);
}
