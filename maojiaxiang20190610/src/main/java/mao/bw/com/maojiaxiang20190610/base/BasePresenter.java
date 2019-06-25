package mao.bw.com.maojiaxiang20190610.base;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import mao.bw.com.maojiaxiang20190610.bean.Result;
import mao.bw.com.maojiaxiang20190610.core.DataCall;
import mao.bw.com.maojiaxiang20190610.model.IRequest;
import mao.bw.com.maojiaxiang20190610.util.HttpUtil;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/10 09:01:08
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
                        if ("0000".equals(o.status)){
                            dataCall.onSuccess(o.result);
                        }else {
                            dataCall.fail(o);
                        }

                    }
                });
    }
    protected abstract Observable getModel(IRequest iRequest,Object...args);
}
