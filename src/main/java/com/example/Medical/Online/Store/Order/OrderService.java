package com.example.Medical.Online.Store.Order;

import java.io.FileWriter;
import java.io.IOException;

public class OrderService {

    public void placeOrder(Order order) throws IOException{
        FileWriter FW = new FileWriter("orders.txt", true);
        FW.write(order.getOrderID() + ", " + order.getUserID() + ", " + order.getMedicineName() + ", " + order.getQty() + "\n");

        FW.close();
    }

}
