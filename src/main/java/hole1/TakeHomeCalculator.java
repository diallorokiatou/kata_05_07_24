package hole1;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Pair<Integer, String> netAmount(Pair<Integer, String> first, Pair<Integer, String>... rest) {

        Pair<Integer, String> total = first;

        for (Pair<Integer, String> next : rest) {
            if (!next.currency().equals(total.currency())) {
                throw new Incalculable();
            }
        }

        for (Pair<Integer, String> next : rest) {
            total = new Pair<>(total.amount() + next.amount(), next.currency());
        }

        Double amount = total.amount() * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>(amount.intValue(), first.currency());

        if (total.currency().equals(tax.currency())) {
            return new Pair<>(total.amount() - tax.amount(), first.currency());
        }
        throw new Incalculable();
    }
}
