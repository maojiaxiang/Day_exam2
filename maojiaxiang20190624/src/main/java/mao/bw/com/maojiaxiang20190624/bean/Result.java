package mao.bw.com.maojiaxiang20190624.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 08:53:16
 * @Description: 描述信息
 */
public class Result<T> {
    /* "message": "查询成功",
             "status": "0000"*/
    public String message;
    public String status;
    public T result;

    public Result() {
    }

    public Result(String message, String status) {
        this.message = message;
        this.status = status;
    }
}
