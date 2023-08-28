package ch_06;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = (num1 > num2) ? num1 : num2;
        double max = (temp > num3) ? temp : num3;

        System.out.println((num1 + num2 + num3 - max - temp) + " " + temp + " " + max);
    }
}
