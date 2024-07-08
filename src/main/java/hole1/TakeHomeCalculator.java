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
            if (!next.second.equals(total.second)) {
                throw new Incalculable();
            }
        }

        for (Money next : monies) {
            total = new Money(total.value + next.value, next.second);
        }

        Double amount = total.value * (percent / 100d);
        Money tax = new Money(amount.intValue(), first.second);

        if (total.second.equals(tax.second)) {
            return new Money(total.value - tax.value, first.second);
        }
        throw new Incalculable();
    }

    static class Money {
        final Integer value;
        final String second;

        Money(Integer value, String second) {
            this.value = value;
            this.second = second;
        }

    }
}