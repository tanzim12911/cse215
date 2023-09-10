package ch_06;

import java.util.Scanner;

public class q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int noOfSides = sc.nextInt();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        System.out.println("The area of the pentagon is " + area(noOfSides, side));
    }

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4.0 * Math.tan(Math.PI / n));
    }
}
