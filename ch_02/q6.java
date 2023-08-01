package ch_02;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int digit_1 = num / 100;
        int temp = num % 100;
        int digit_2 = temp / 10;
        int digit_3 = temp % 10;

        int digit_sum = digit_1 + digit_2 + digit_3;

        System.out.println("The sum of the digits is: " + digit_sum);
    }
    
}
