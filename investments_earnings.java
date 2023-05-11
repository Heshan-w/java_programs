package projects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class investments_earnings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter your buying price per share : ");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice;
        double earnings;

        while (true) {
            System.out.print("Enter your closing price for day " + day +
                    "\n(any negative value entered will cause program to exit)" + "\nEnter closing value here : ");
            closingPrice = sc.nextDouble();
            if (closingPrice < 0) {
                break;
            }
            earnings = closingPrice - buyingPrice;
            if (earnings > 0) {
                System.out.println("\nAfter day " + day + " you've earned " + df.format(earnings) + " per share\n");
            } else if (earnings < 0) {
                System.out.println("\nAfter day " + day + " you've lost " + df.format(-earnings) + " per share\n");
            } else {
                System.out.println("\nAfter day " + day + " you've have no earnings or losses per share\n");
            }
            day++;
        }
        sc.close();
    }
}