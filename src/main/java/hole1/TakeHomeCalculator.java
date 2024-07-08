package hole1;

import java.util.Arrays;

public class TakeHomeCalculator {

    private final int percent;
    private final Money[] carts;
    private final String currentCurrency;

    TakeHomeCalculator(int percent, Money... carts) {
        currentCurrency = returnCurrentCurrency(carts);
        this.percent = percent;
        this.carts = carts;
    }

    private String returnCurrentCurrency(Money[] carts) {
        String currency = carts[0].currency();
        if(!Arrays.stream(carts).map(Money::currency).allMatch(currencyOver -> currencyOver.equals(currency))){
            throw  new Incalculable();
        }
        return currency;
    }

    Money netAmount() {
        Money total = new Money(Arrays.stream(carts).map(Money::amount).reduce(0, Integer::sum), currentCurrency);
        Money tax = calculateTax(total);
        return new Money(total.amount() - tax.amount(), currentCurrency);
    }

    private Money calculateTax(Money total) {
        double amount = total.amount() * (percent / 100d);
        return new Money((int) amount, total.currency());
    }
}
