package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * Ceil the amount * 0.9, 3 times, representing spending 0.1 * amount,
     * 3 times, rounding up due to int.
     * @param amount: the starting amount of cash at the beginning of the 3 month period.
     * @return the amount after 3 months of paying a monthly 10% 0-interest loan.
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        for(int i = 0; i < 3; ++i)
            amount = (int)Math.ceil(amount * 0.9);
        return amount;
        //return (((int)((amount * 0.729) * 100)) / 100);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
