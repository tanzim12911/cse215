package ch_09.q11;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values of a, b, c, d, e & f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        LinearEquation eqn = new LinearEquation(a, b, c, d, e, f);

        if (eqn.isSolvable()){
            System.out.println("x: " + eqn.getX());
            System.out.println("y: " + eqn.getY());
        }
        else
            System.out.println("The equation has no solution.");
    }
}
