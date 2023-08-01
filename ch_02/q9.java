package ch_02;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v0, v1, t, acceleration;

        System.out.print("Enter v0, v1, and t : ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        acceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is " + acceleration);

    }
}
