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
        String reportString ="";
        double amountTotal = orders.stream().map(order -> order.getDrinkType()).map(drink -> drink.amount()).reduce((aDouble, aDouble2) -> aDouble + aDouble2).get();
        for (Drink drink: Drink.values()) {
            long numberOfDrink = orders.stream().map(order -> order.getDrinkType()).filter(drinkType -> drink == drinkType).count();
            if(numberOfDrink > 0) {
                reportString += (numberOfDrink + " " + drink.getName() + "\n");
            }
        }
        reportString += "Total amout : " + amountTotal;
        return reportString;
    }
}
