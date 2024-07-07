package org.example;

public class Order {
    private final Drink drinkType;
    private final int sugarNumber;

    public Order(Drink drinkType, int sugarNumber) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
    }

    public String showMessage(){
        if(sugarNumber == 0) {
           return "Drink maker makes 1 " +  drinkType.toString().toLowerCase() + " with no sugar and therefore no stick";
        }
        if(sugarNumber == 1) {
            return  "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() + " with " + sugarNumber  + " sugar and a stick";
        }
        return "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() + " with " + sugarNumber  + " sugars and a stick";
    }
}
