package projects;

import java.util.Scanner;

public class mortgage_calculator {
    public static void main(String[] args) {
        int monthsInAYear = 12;
        int percent = 100;
        Scanner sc = new Scanner(System.in);
        double principal = 0;
        float annualIntrestRate = 0;
        double years = 0;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = sc.nextDouble();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Intrest Rate : ");
            annualIntrestRate = sc.nextFloat();
            if (annualIntrestRate > 0 && annualIntrestRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while (true) {
            System.out.print("period (years): ");
            years = sc.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }

        sc.close();
        int numberOfPayments = (int) (years * monthsInAYear);
        float monthlyIntrest = annualIntrestRate / monthsInAYear / percent;
        double mortgage = principal
                * (monthlyIntrest) * Math.pow(1 + monthlyIntrest, numberOfPayments)
                / ((Math.pow(1 + monthlyIntrest, numberOfPayments) - 1));
        System.out.println(mortgage);
    }
}
