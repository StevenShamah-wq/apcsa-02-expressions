/**
 * Exercise 6 — TipCalculator
 *
 * Given a bill amount, a tip percentage, and a number of people,
 * print the tip, the total, and each person's share —
 * all rounded to exactly 2 decimal places.
 *
 * Rounding to 2 decimals:
 *   Math.round(value * 100) / 100.0
 *
 * Watch that .0 — leave it off and you're back in integer division.
 */
public class TipCalculator {
    public static void main(String[] args) {
        double billAmount = 87.35;
        int tipPercent = 18;
        int people = 4;
        double tip = Math.round(billAmount * tipPercent / 100.0 * 100) / 100.0;
        double total = Math.round((billAmount + tip) * 100) / 100.0;
        double share = Math.round((total / people) * 100) / 100.0;

        System.out.printf("Tip: $%.2f%n", tip);
        System.out.printf("Total: $%.2f%n", total);
        System.out.printf("Each person's share: $%.2f%n", share);

    }
}
