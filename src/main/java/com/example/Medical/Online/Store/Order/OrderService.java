package com.example.Medical.Online.Store.Order;

import java.io.FileWriter;
import java.io.IOException;

public class OrderService {

    public void placeOrder(Order order) throws IOException{
        FileWriter FW = new FileWriter("orders.txt", true);
        FW.write(order.getOrderId() + ", " + order.getUserId() + ", " + order.getMedicineName() + ", " + order.getQuantity() + "\n");

        FW.close();
    }

}
