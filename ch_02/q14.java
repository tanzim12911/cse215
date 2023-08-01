package ch_02;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.45359237;

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;

        double bmi = kilograms / (Math.pow(meters, 2));

        System.out.println("BMI is " + bmi);
    }
    
}
