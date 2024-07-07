package org.example;

public class Order {
    private final Drink drinkType;
    private final int sugarNumber;
    private String message;

    public Order(Drink drinkType, int sugarNumber, double amount) {
        this.drinkType = drinkType;
        this.sugarNumber = sugarNumber;
        if(amount < drinkType.getAmount()) message = drinkType.getAmount() - amount + " euro is missing to making " + drinkType.toString().toLowerCase();
    }


    public String sendMessage(){
        if(message != null) return message;
        if(drinkType == Drink.ORANGE){
            return "Drink maker will make one orange juice";
        }
        if(sugarNumber == 0) {
           return "Drink maker makes 1 " +  drinkType.toString().toLowerCase() + " with no sugar and therefore no stick";
        }
        if(sugarNumber == 1) {
            return "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() + " with " + sugarNumber  + " sugar and a stick";
        }
        return "Drink maker makes 1 "  +  drinkType.toString().toLowerCase() + " with " + sugarNumber  + " sugars and a stick";
    }
}
