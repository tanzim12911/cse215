package ch_03;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = sc.nextDouble();

        int amount_cents = (int) (amount * 100);
        int amount_dollars = amount_cents / 100;
        int temp = amount_cents % 100;
        int amount_quarters = (temp) / 25;
        temp %= 25;
        int amount_dimes = temp / 10;
        temp %= 10;
        int amount_nickels = temp / 5;
        int amount_pennies = temp % 5;

        System.out.println("Your amount " + amount + " consists of");

        if (amount_dollars > 1)
            System.out.println("    " + amount_dollars + " dollar(s)");
        else
            System.out.println("    " + amount_dollars + " dollar");
        
        if (amount_quarters > 1)
            System.out.println("    " + amount_quarters + " quarter(s)");
        else
            System.out.println("    " + amount_quarters + " quarter");

        if (amount_dimes > 1)
            System.out.println("    " + amount_dimes + " dime(s)");
        else
            System.out.println("    " + amount_dimes + " dime");

        if (amount_nickels > 1)
            System.out.println("    " + amount_nickels + "nickel(s)");
        else
            System.out.println("    " + amount_nickels + "nickel");
        
            if (amount_pennies > 1)
            System.out.println("    " + amount_pennies + "pennies(s)");
        else
            System.out.println("    " + amount_pennies + "penny");

    }
}
