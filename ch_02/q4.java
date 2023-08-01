package ch_02;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + "pounds is " + kilograms + " kilograms");
    }
    
}
