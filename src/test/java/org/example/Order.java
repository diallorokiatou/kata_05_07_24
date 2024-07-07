package org.example;

public class Order {
    private final Drink drinkType;
    private final int sugarNumber;
    private String message;

    public Order(Drink drinkType, int sugarNumber, double amount) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
        if(amount < drinkType.amount()) message = drinkType.amount() - amount + " euro is missing to making " + drinkType.description();
    }


    public String sendMessage(){
        if(message != null) return message;
        if(drinkType == Drink.O){
            return "Drink maker will make one "  + drinkType.description();
        }
        if(sugarNumber == 0) {
           return "Drink maker makes 1 " +  drinkType.description() + " with no sugar and therefore no stick";
        }
        if(sugarNumber == 1) {
            return "Drink maker makes 1 "  +  drinkType.description() + " with " + sugarNumber  + " sugar and a stick";
        }
        return "Drink maker makes 1 "  +  drinkType.description() + " with " + sugarNumber  + " sugars and a stick";
    }
}
