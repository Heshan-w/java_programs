package projects.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Goliath National Bank ATM system !");
        System.out.print("Enter pin number : ");
        int pin = scanner.nextInt();
        ATM atmUser = new ATM(pin);

        while (true) {
            System.out.print(
                    "To check bank balance enter 1.\nTo withdraw funds enter '2'.\nTo deposit funds enter '3'.\nTo exit program enter '4'\nEnter input : ");
            String userInput = scanner.next();
            switch (userInput) {
                case "1":
                    System.out.println("\n" + atmUser.getBalance() + "\n");
                    break;
                case "2":
                    System.out.print("\nEnter amount to withdraw :");
                    double withdrawAmount = scanner.nextDouble();
                    atmUser.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.print("\nEnter amount to deposit :");
                    double DepositAmount = scanner.nextDouble();
                    atmUser.deposit(DepositAmount);
                    break;
                case "4":
                    System.out.println("\nThank you for using our services");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nInvalid input please re-enter\n");
            }
        }

    }

}
