package ch_06;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong();
        System.out.println("Sum of the digits: " + sumDigits(num));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        int num = (int) n;
        while (num != 0) {
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        
        return sum;
    }
}
