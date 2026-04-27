package com.example.Medical.Online.Store.Order;

public class Order {
    private String orderId;
    private String userId;
    private String medicineName;
    private int quantity;

    public Order() {}

    public Order(String orderId, String userId, String medicineName, int quantity) {
        this.orderId = orderId;
        this.userId = userId;
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    // Making the Setters
    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setMedicineName(String medicineName){
        this.medicineName = medicineName;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Making the Getters
    public String getOrderId(){
        return orderId;
    }
    public String getUserId(){
        return userId;
    }
    public String getMedicineName(){
        return medicineName;
    }
    public int getQuantity(){
        return quantity;
    }


}
