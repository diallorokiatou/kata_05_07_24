package org.example;

public enum Drink {
    Hh(0.5, "extra hot chocolate"),
    Ch(0.6, "extra hot coffee"),
    Th(0.4, "extra hot tea"),
    O(0.6, "orange juice"),
    H(0.5, "chocolate"),
    C(0.6, "coffee"),
    T(0.4, "tea");

    private final double amount;
    private final String description;

    Drink(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public String description() {
        return description;
    }

    public double amount(){
        return amount;
    }
}
