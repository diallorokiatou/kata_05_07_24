package org.example;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    List<Order> orders;

    public CoffeeMachine() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String printReport(){
        return "";
    }
}
