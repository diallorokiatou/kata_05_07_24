package hole1;

import java.util.Arrays;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Pair<Integer, String> netAmount(Pair<Integer, String>... cart) {
        String currency = cart[0].currency();
        if(!Arrays.stream(cart).map(Pair::currency).allMatch(currencyOver -> currencyOver.equals(currency))){
            throw  new Incalculable();
        }
        Pair<Integer, String> total = new Pair<>(Arrays.stream(cart).map(Pair::amount).reduce(0, Integer::sum), currency);
        Pair<Integer, String> tax = calculateTax(total);
        return new Pair<>(total.amount() - tax.amount(), currency);
    }

    private Pair<Integer, String> calculateTax(Pair<Integer, String> total) {
        Double amount = total.amount() * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>(amount.intValue(), total.currency());
        return tax;
    }
}
