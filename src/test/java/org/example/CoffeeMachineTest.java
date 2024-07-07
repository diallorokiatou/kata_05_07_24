package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {
    @Test
    void should_print_report(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addOrder(new Order(Drink.Th, 2, 0.6));
        coffeeMachine.addOrder(new Order(Drink.Th, 2, 0.6));
        coffeeMachine.addOrder(new Order(Drink.Th, 2, 0.6));
        coffeeMachine.addOrder(new Order(Drink.T, 2, 0.6));
        coffeeMachine.addOrder(new Order(Drink.C, 2, 0.6));

        assertEquals("""
                3 extra hot chocolat\s
                1 tea
                 +1 coffee\s
                 +Total amout ; 2,2\s""", coffeeMachine.printReport());
    }

    @Test
    void should_order_extra_hot_tea_with_2_sugar_and_a_stick(){
        Order order = new Order(Drink.Th, 2, 0.6);

        assertEquals("Drink maker makes an extra hot tea with 2 sugar and a stick", order.sendMessage());
    }

    @Test
    void should_order_extra_hot_chocolate_with_no_sugar_and_no_stick(){
        Order order = new Order(Drink.Hh, 0, 0.6);

        assertEquals("Drink maker makes an extra hot chocolate with no sugar and therefore no stick", order.sendMessage());
    }

    @Test
    void should_order_orange_juice_with_no_sugar_and_no_stick(){
        Order order = new Order(Drink.O, 0, 0.6);

        assertEquals("Drink maker will make one orange juice", order.sendMessage());
    }

    @Test
    void should_not_make_drink_when_amount_is_correct(){
        Order order = new Order(Drink.H, 0, 0.1);

        assertEquals("0.4 euro is missing to making 1 chocolate", order.sendMessage());
    }

    @Test
    void should_make_drink_when_amount_is_correct(){
        Order order = new Order(Drink.H, 0, 0.6);

        assertEquals("Drink maker makes 1 chocolate with no sugar and therefore no stick", order.sendMessage());
    }

    @Test
    void should_order_chocolat_with_no_sugar_and_no_stick(){
        Order order = new Order(Drink.H, 0, 0.6);

        assertEquals("Drink maker makes 1 chocolate with no sugar and therefore no stick", order.sendMessage());
    }

    @Test
    void should_order_a_tea_with_1_sugar_and_a_stick(){
        Order order = new Order(Drink.T, 1, 0.6);

        assertEquals("Drink maker makes 1 tea with 1 sugar and a stick", order.sendMessage());
    }

    @Test
    void should_order_a_coffee_with_2_sugar_and_a_stick(){
        Order order = new Order(Drink.C, 2, 0.6);

        assertEquals("Drink maker makes 1 coffee with 2 sugar and a stick", order.sendMessage());
    }


}