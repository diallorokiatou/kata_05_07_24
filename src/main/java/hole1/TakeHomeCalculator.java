package hole1;

import java.util.Arrays;

class TakeHomeCalculator {

    private final TaxRate taxRate;

    TakeHomeCalculator(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    Money netAmount(Money first, Money... rest) {
        Money total = Arrays.stream(rest).reduce(first, Money::plus);
        Money tax = taxRate.apply(total);
        return total.minus(tax);
    }

}