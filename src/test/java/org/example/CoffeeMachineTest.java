package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {

    @Test
    void should_order_chocolat_whith_no_sugar_and_no_stcik(){
        Order order = new Order()

        assertEquals(order.type, Drink.CHOCOLAT);
        assertEquals(order.sugar, 0);
        assertEquals(order.stick, true);
        assertEquals(order.message, "Drink maker makes 1 chocolate with no sugar and therefore no stick");
    }


}