package projects;

import java.util.Scanner;

public class average_stock_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter budget : ");
        double budget = sc.nextDouble();
        System.out.println("$" + budget);

        sc.close();
    }
}
