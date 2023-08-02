package ch_03;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess_number = sc.nextInt();

        int guess_digit1 = guess_number / 100;
        int temp = guess_number % 100;
        int guess_digit2 = temp / 10;
        int guess_digit3 = temp % 10;

        int lottery_number = (int) (Math.random() * 100);

        int lottery_digit1 = lottery_number / 100;
        temp = lottery_number % 100;
        int lottery_digit2 = temp / 10;
        int lottery_digit3 = temp % 10;

        if (guess_number == lottery_number)
            System.out.println("Exact match: you win $10,000");
        else if (guess_digit1 == lottery_digit2 || guess_digit1 == guess_digit3
                || guess_digit2 == guess_digit1 || guess_digit2 == guess_digit3
                || guess_digit3 ==)
    }
}
