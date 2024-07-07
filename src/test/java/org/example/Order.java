package org.example;

public class Order {
    private Drink drinkType;
    private int sugarNumber;
    private Boolean stick;

    public Order(Drink drinkType, int sugarNumber, Boolean stick) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
        this.stick = stick;
    }
}
