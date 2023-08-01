package ch_03;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double r1, r2;

        double D = Math.pow(b, 2) - (4 * a * c);

        if (D < 0)
            System.out.println("The equation has no real roots");
        else if (D == 0) {
            r1 = (- b + Math.pow(D, 0.5)) / (2 * a);
            System.out.println("The equation has one root " + r1);
        }
        else {
            r1 = (- b + Math.pow(D, 0.5)) / (2 * a);
            r2 = (- b - Math.pow(D, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and" + r2);
        }
        
    }
    
}
