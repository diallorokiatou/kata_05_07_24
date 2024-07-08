package hole1;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Pair<Integer, String> netAmount(Pair<Integer, String> first, Pair<Integer, String>... rest) {

        Pair<Integer, String> total = first;

        for (Pair<Integer, String> next : rest) {
            if (!next.second.equals(total.second)) {
                throw new Incalculable();
            }
        }

        for (Pair<Integer, String> next : rest) {
            total = new Pair<>(total.first + next.first, next.second);
        }

        Double amount = total.first * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>(amount.intValue(), first.second);

        if (total.second.equals(tax.second)) {
            return new Pair<>(total.first - tax.first, first.second);
        } else {
            throw new Incalculable();
        }
    }
}
