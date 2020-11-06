package com.xzzy.essp.bean;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 16:55
 * description:商品
 */
public class Usp {
    private int uspId;
    private int spId;
    private int userId;
    private String uspName;

    public String getUspName() {
        return uspName;
    }

    public void setUspName(String uspName) {
        this.uspName = uspName;
    }

    private float uspCost;
    private String uspMassage;
    private int uspCount;
    private User user;
    private Sp sp;

    public int getUspId() {
        return uspId;
    }

    public void setUspId(int uspId) {
        this.uspId = uspId;
    }

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getUspCost() {
        return uspCost;
    }

    public void setUspCost(float uspCost) {
        this.uspCost = uspCost;
    }

    public String getUspMassage() {
        return uspMassage;
    }

    public void setUspMassage(String uspMassage) {
        this.uspMassage = uspMassage;
    }

    public int getUspCount() {
        return uspCount;
    }

    public void setUspCount(int uspCount) {
        this.uspCount = uspCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Sp getSp() {
        return sp;
    }

    public void setSp(Sp sp) {
        this.sp = sp;
    }

    @Override
    public String toString() {
        return "Usp{" +
                "uspId=" + uspId +
                ", spId=" + spId +
                ", userId=" + userId +
                ", uspName='" + uspName + '\'' +
                ", uspCost=" + uspCost +
                ", uspMassage='" + uspMassage + '\'' +
                ", uspCount=" + uspCount +
                ", user=" + user +
                ", sp=" + sp +
                '}';
    }
}
