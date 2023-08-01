package ch_02;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double temp = 3 * Math.pow(3, 0.5) * Math.pow(s, 2);

        double area = temp / 2;

        System.out.println("The area of the hexagon is " + area);
    }
    
}
