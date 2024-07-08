package hole1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer amount = new TakeHomeCalculator(10, new Money(40, "GBP"), new Money(50, "GBP"), new Money(60, "GBP")).netAmount().amount();
        assertEquals(135, amount.intValue());
    }

    @Test
    public void cannotSumDifferentCurrencies() throws Exception {
        assertThrows(Incalculable.class, () -> new TakeHomeCalculator(10, new Money(4, "GBP"), new Money(5, "USD")).netAmount());
    }
}