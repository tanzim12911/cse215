package ch_03;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = sc.nextDouble();

        if (weight > 0 && weight <= 1)
            System.out.println("Shipping cost is $3.5");
        else if (weight <= 3)
            System.out.println("Shipping cost is $5.5");
        else if (weight <= 10)
            System.out.println("Shipping cost is $8.5");
        else if (weight <= 20)
            System.out.println("Shipping cost is $10.5");
        else
            System.out.println("The pacakage cannot be shipped");
    }
}
