package movie.bw.com.maojiaxiang20190620.base;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import movie.bw.com.maojiaxiang20190620.bean.Result;
import movie.bw.com.maojiaxiang20190620.core.DataCall;
import movie.bw.com.maojiaxiang20190620.model.IRequest;
import movie.bw.com.maojiaxiang20190620.util.HttpUtil;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/20 09:00:55
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
                            dataCall.onSuccess(o.result);
                        }else {
                            dataCall.fail(o);
                        }
                    }
                });
    }
    protected abstract Observable getModel(IRequest iRequest,Object...args);
}
