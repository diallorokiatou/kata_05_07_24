package org.example;

public enum Drink {
    Hh("extra hot chocolate",0.5, "an extra hot chocolate"),
    Ch("extra hot coffee",0.6, "an extra hot coffee"),
    Th( "extra hot tea",0.4, "an extra hot tea"),
    O("orange juice",0.6, "one orange juice"),
    H("chocolate",0.5, "1 chocolate"),
    C("coffee",0.6, "1 coffee"),
    T("tea",0.4, "1 tea");

    private final double amount;
    private final String description;

    public String getName() {
        return name;
    }

    private final String name;

    Drink(String name, double amount, String description) {
        this.amount = amount;
        this.description = description;
        this.name = name;
    }

    public String description() {
        return description;
    }

    public double amount(){
        return amount;
    }
}
