package org.example;

import org.junit.jupiter.api.Test;

class CoffeeMachineTest {

    @Test
    void should_order_chocolat_whith_no_sugar_and_no_stcik(){
        Order order = new Order(Drink.CHOCOLAT, 0, false);

        assertEquals(order.type, Drink.CHOCOLAT);
        assertEquals(order.sugar, 0);
        assertEquals(order.stick, false);
        assertEquals(order.message, "Drink maker makes 1 chocolate with no sugar and therefore no stick");
    }


}