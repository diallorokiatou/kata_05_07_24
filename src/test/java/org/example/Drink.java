package org.example;

public enum Drink {
    CHOCOLATE(0.5), COFFEE(0.6), TEA(0.4);

    private final double amount;

    Drink(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
