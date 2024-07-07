package org.example;

public class Order {
    private String message;
    private Drink drinkType;
    private int sugarNumber;
    private Boolean stick = false;

    public Order(Drink drinkType, int sugarNumber) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
        if(sugarNumber > 0) this.stick = true;
    }

    public String showMessage(){
        String msg;
        if(sugarNumber == 0) {
           msg = "Drink maker makes 1 chocolate with no sugar and therefore no stick";
        }
        else msg = "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() +
                " with " + sugarNumber  + " sugar and a stick";
        return msg;
    }
}
