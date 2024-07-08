package hole1;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Pair<Integer, String> netAmount(Pair<Integer, String>... rest) {

        String currency = rest[0].currency();
        Pair<Integer, String> total = new Pair<>(0, currency);

        for (Pair<Integer, String> next : rest) {
            if (!next.currency().equals(total.currency())) {
                throw new Incalculable();
            }
        }

        for (Pair<Integer, String> next : rest) {
            total = new Pair<>(total.amount() + next.amount(), next.currency());
        }

        Double amount = total.amount() * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>(amount.intValue(), currency);

        if (total.currency().equals(tax.currency())) {
            return new Pair<>(total.amount() - tax.amount(), currency);
        }
        throw new Incalculable();
    }
}
