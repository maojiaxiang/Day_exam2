package mao.bw.com.day_exam.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/9 16:16:00
 * @Description: 描述信息
 */
public class Result<T> {
    /*"message": "查询成功",
            "status": "0000"*/
    public String message="请求失败";
    public String status="-1";
    public T result;

    public Result() {
    }

    public Result(String message, String status) {
        this.message = message;
        this.status = status;
    }
}
