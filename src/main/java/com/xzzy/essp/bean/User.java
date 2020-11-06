package com.xzzy.essp.bean;

/**
 * projectName: essp
 *
 * @author: 王子琦
 * time: 2020/11/6 16:53
 * description:用户
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private float userMoney;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public float getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(float userMoney) {
        this.userMoney = userMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userMoney=" + userMoney +
                '}';
    }
}
