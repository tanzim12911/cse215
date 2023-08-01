package ch_02;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char degreeSymbol = '\u00B0';

        System.out.print("Enter the temperature in Fahrenheit between -58" + degreeSymbol + "F and 41" + degreeSymbol + "F:");
        double t_a = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();

        double temp = Math.pow(v, 0.16);
        double t_wc = 35.74 + (0.6215 * t_a) - (35.75 * temp) + (0.4275 * t_a * temp);

        System.out.println("The wind chill index is " + t_wc);
    }
    
}
