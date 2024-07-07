package org.example;

public class Order {
    private final Drink drinkType;
    private final int sugarNumber;

    public Order(Drink drinkType, int sugarNumber) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
    }

    public String showMessage(){
        String msg;
        if(sugarNumber == 0) {
           msg = "Drink maker makes 1 " +  drinkType.toString().toLowerCase() + " with no sugar and therefore no stick";
        }
        else if(sugarNumber == 1) msg = "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() +
                " with " + sugarNumber  + " sugar and a stick";
        else msg = "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() +
                " with " + sugarNumber  + " sugars and a stick";
        return msg;
    }
}
