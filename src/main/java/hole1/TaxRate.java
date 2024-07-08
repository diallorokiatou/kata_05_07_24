package hole1;

import static hole1.Money.money;

public record TaxRate(int percent) {
    Money apply(Money total) {
        Double amount = total.value * (percent() / 100d);
        return money(amount.intValue(), total.currency);
    }
}