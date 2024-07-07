package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {

    @Test
    void should_order_chocolat_whith_no_sugar_and_no_stick(){
        Order order = new Order(Drink.CHOCOLATE, 0);

        assertEquals("Drink maker makes 1 chocolate with no sugar and therefore no stick", order.showMessage());
    }

    @Test
    void should_order_a_tea_with_1_sugar_and_a_stick(){
        Order order = new Order(Drink.TEA, 1);

        assertEquals("Drink maker makes 1 tea with 1 sugar and a stick", order.showMessage());
    }

    @Test
    void should_order_a_coffee_with_2_sugar_and_a_stick(){
        Order order = new Order(Drink.COFFEE, 2);

        assertEquals("Drink maker makes 1 coffee with 2 sugars and a stick", order.showMessage());
    }


}