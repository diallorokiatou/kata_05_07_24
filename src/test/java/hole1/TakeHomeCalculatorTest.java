
package hole1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new TakeHomeCalculator(TaxRate.taxRate(10)).netAmount(Money.money(40, "GBP"), Money.money(50, "GBP"), Money.money(60, "GBP")).value;
        assertEquals(135, first.intValue());
    }

    @Test
    public void cannotSumDifferentCurrencies() throws Exception {
        assertThrows(Incalculable.class, () -> {
            new TakeHomeCalculator(TaxRate.taxRate(10)).netAmount(Money.money(4, "GBP"), Money.money(5, "USD"));
        });
    }
}
