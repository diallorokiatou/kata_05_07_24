package hole1;

import java.util.Arrays;
import java.util.List;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Money netAmount(Money first, Money... rest) {

        List<Money> monies = Arrays.asList(rest);

        Money total = first;

        for (Money next : monies) {
            total = total.plus(next);
        }

        Double amount = total.value * (percent / 100d);
        Money tax = new Money(amount.intValue(), first.currency);

        return total.minus(tax);
    }

    static class Money {
        final Integer value;
        final String currency;

        Money(Integer value, String currency) {
            this.value = value;
            this.currency = currency;
        }

        private Money minus(Money other) {
            if (!this.currency.equals(other.currency)) {
                throw new Incalculable();
            }
            return new Money(this.value - other.value, other.currency);
        }

        private Money plus(Money other) {
            if (!other.currency.equals(this.currency)) {
                throw new Incalculable();
            }
            return new Money(this.value + other.value, other.currency);
        }
    }
}