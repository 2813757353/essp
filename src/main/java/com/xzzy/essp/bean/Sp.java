package com.xzzy.essp.bean;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 16:52
 * description:商品类型
 */
public class Sp {
    private int spId;
    private String spType;

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType;
    }

    @Override
    public String toString() {
        return "Sp{" +
                "spId=" + spId +
                ", spType='" + spType + '\'' +
                '}';
    }
}
