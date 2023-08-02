package ch_03;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System,in);

        System.out.print("Enter a three-digit integer: ");
        int number = sc.nextInt();

        int temp = number;
        int remainder, reverse = 0;

        while (number > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        if (number == reverse)
            System.out.println(number + " is a Palindrome");
        else
            System.out.println(number + " is not a Palindrome");
    }
}
