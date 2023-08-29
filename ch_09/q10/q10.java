package ch_09.q10;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for a, b & c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation eqn = new QuadraticEquation(a, b, c);

        if (eqn.getDiscriminant() > 0) {
            System.out.println("The equation has two roots.");
            System.out.println("Root 1: " + eqn.getRoot1());
            System.out.println("Root 2: " + eqn.getRoot2());
        }
        else if (eqn.getDiscriminant() == 0) {
            System.out.println("The equation has one root.");
            System.out.println("Root: " + eqn.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }            
    }
}
