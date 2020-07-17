package com.ilovemengmei.ccstraining2020.domain.vo;

public class Order {

    private int id;
    private String userName;
    private String realName;
    private int orderAmount;
    private String orderDate;
    private String orderState;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderDate='" + orderDate + '\'' +
                ", orderState='" + orderState + '\'' +
                '}';
    }
}
