package org.example;

public enum Drink {
    Hh(0.5, "an extra hot chocolate"),
    Ch(0.6, "an extra hot coffee"),
    Th(0.4, "an extra hot tea"),
    O(0.6, "one orange juice"),
    H(0.5, "1 chocolate"),
    C(0.6, "1 coffee"),
    T(0.4, "1 tea");

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
