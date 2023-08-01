package ch_03;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight_lbs = sc.nextDouble();
        System.out.print("Enter feet: ");
        double height_ft = sc.nextDouble();
        System.out.print("Enter inches: ");
        double height_in = sc.nextDouble();

        double weight_kgs = weight_lbs * 0.45359237;
        double height_m = (height_ft * 12 + height_in) * 0.0254;

        double bmi = weight_kgs / Math.pow(height_m, 2);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi >= 18.5 || bmi < 25)
            System.out.println("Normal");
        else if (bmi >= 25 || bmi <= 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }
    
}
