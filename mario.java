package projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        while (true) {
            try {
                System.out.print("Enter height : ");
                height = sc.nextInt();
                if (height > 0 && height <= 8) {
                    break;
                } else {
                    System.out.println("Value entered is out of range. Please re-enter\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Value entered is not an integer. Please re-enter\n");
                sc.nextLine();
            }
        }
        sc.close();
    
        // topDownLR
        for (int i = 1; i <= height; i++) {
            System.out.print("*");
            for (int j = 1; j <= (height - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // bottomUpLR
        for (int i = 1; i <= height; i++) {
            System.out.print("*");
            for (int j = (height - 1); j > (height - i); j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
