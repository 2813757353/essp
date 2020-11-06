package com.xzzy.essp.bean;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 16:57
 * description:返回结果
 */
public class Result {
    private int code;
    private String massage;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
