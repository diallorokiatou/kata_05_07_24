package hole1;

import static hole1.Money.money;

public final class TaxRate {
    private final int percent;

    private TaxRate(int percent) {
        this.percent = percent;
    }

    public static TaxRate taxRate(int percent) {
        return new TaxRate(percent);
    }

    Money apply(Money total) {
        Double amount = total.value * (percent / 100d);
        return money(amount.intValue(), total.currency);
    }
}