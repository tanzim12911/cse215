package ch07;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        double[] numList = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numList[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i++) {
            System.out.print(numList[i] + " ");
        }
    }
}
