package com.example.Medical.Online.Store.Order;

public class Order {
    private String orderID;
    private String userID;
    private String medicineName;
    private int qty;

    public Order() {
    }

    public Order(String orderID, String userID, String medicineName, int qty) {
        this.orderID = orderID;
        this.userID = userID;
        this.medicineName = medicineName;
        this.qty = qty;
    }

    // Making the Setters
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }
    public void setMedicineName(String medicineName){
        this.medicineName = medicineName;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    //Making the Getters
    public String getOrderID(){
        return orderID;
    }
    public String getUserID(){
        return userID;
    }
    public String getMedicineName(){
        return medicineName;
    }
    public int getQty(){
        return qty;
    }


}
