package hole1;

class Money {
    final Integer value;
    final String currency;

    private Money(Integer value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    static Money money(Integer value, String currency) {
        return new Money(value, currency);
    }

    Money minus(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new Incalculable();
        }
        return money(this.value - other.value, other.currency);
    }

    Money plus(Money other) {
        if (!other.currency.equals(this.currency)) {
            throw new Incalculable();
        }
        return money(this.value + other.value, other.currency);
    }
}
