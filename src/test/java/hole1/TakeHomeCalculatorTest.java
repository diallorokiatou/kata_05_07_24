package hole1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer amount = new TakeHomeCalculator(10).netAmount(new Pair<>(40, "GBP"), new Pair<>(50, "GBP"), new Pair<>(60, "GBP")).amount();
        assertEquals(135, amount.intValue());
    }

    @Test
    public void cannotSumDifferentCurrencies() throws Exception {
        assertThrows(Incalculable.class, () -> new TakeHomeCalculator(10).netAmount(new Pair<>(4, "GBP"), new Pair<>(5, "USD")));
    }
}