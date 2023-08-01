package ch_02;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();

        for (int i = 0; i < 6; i++)
        {
            total = (total + amount) * (1 + 0.00417);
        }

        System.out.println("After the sixth month, the account value is $" + total);
    }
    
}
