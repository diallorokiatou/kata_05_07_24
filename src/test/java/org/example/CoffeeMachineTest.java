package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {

    @Test
    void should_order_orange_juice_with_no_sugar_and_no_stick(){
        Order order = new Order(Drink.ORANGE, 0, 0.6);

        assertEquals("Drink maker will make one orange juice", order.sendMessage());
    }

    @Test
    void should_not_make_drink_when_amount_is_correct(){
        Order order = new Order(Drink.CHOCOLATE, 0, 0.1);

        assertEquals("0.4 euro is missing to making chocolate", order.sendMessage());
    }

    @Test
    void should_make_drink_when_amount_is_correct(){
        Order order = new Order(Drink.CHOCOLATE, 0, 0.6);

        assertEquals("Drink maker makes 1 chocolate with no sugar and therefore no stick", order.sendMessage());
    }

    @Test
    void should_order_chocolat_whith_no_sugar_and_no_stick(){
        Order order = new Order(Drink.CHOCOLATE, 0, 0.6);

        assertEquals("Drink maker makes 1 chocolate with no sugar and therefore no stick", order.sendMessage());
    }

    @Test
    void should_order_a_tea_with_1_sugar_and_a_stick(){
        Order order = new Order(Drink.TEA, 1, 0.6);

        assertEquals("Drink maker makes 1 tea with 1 sugar and a stick", order.sendMessage());
    }

    @Test
    void should_order_a_coffee_with_2_sugar_and_a_stick(){
        Order order = new Order(Drink.COFFEE, 2, 0.6);

        assertEquals("Drink maker makes 1 coffee with 2 sugars and a stick", order.sendMessage());
    }


}