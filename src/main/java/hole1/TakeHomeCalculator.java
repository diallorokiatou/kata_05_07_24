package hole1;

import java.util.Arrays;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Money netAmount(Money... cart) {
        String currency = cart[0].currency();
        if(!Arrays.stream(cart).map(Money::currency).allMatch(currencyOver -> currencyOver.equals(currency))){
            throw  new Incalculable();
        }
        Money total = new Money(Arrays.stream(cart).map(Money::amount).reduce(0, Integer::sum), currency);
        Money tax = calculateTax(total);
        return new Money(total.amount() - tax.amount(), currency);
    }

    private Money calculateTax(Money total) {
        Double amount = total.amount() * (percent / 100d);
        return new Money(amount.intValue(), total.currency());
    }
}
