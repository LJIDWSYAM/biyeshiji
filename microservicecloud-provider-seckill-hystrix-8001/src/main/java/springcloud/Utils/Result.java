package springcloud.Utils;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    private Result(T data) {
        this.code=0;
        this.msg="success";
        this.data=data;
    }

    public Result(CodeMsg codeMsg) {
        if (codeMsg==null){
            return;
        }
        this.code=codeMsg.getCode();
        this.msg=codeMsg.getMsg();
    }

    //成功调用
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }
    //失败调用
    public static <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
