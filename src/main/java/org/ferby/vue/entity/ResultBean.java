package org.ferby.vue.entity;

public class ResultBean {
    private int code;
    private String message;
    private Object object;

    public ResultBean(int code, String message, Object objct) {
        this.code = code;
        this.message = message;
        this.object = objct;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}
