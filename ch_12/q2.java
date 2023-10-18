package ch_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        boolean status = false;

        System.out.println("Enter two integers: ");

        do {
            try {
                x = sc.nextInt();
                y = sc.nextInt();
                System.out.println("The sum: " + (x + y));
            }
            catch (InputMismatchException ime) {
                status = true;
                System.out.println("Invalid input, try again.");
            }
        
        } while (status);
    }
}
