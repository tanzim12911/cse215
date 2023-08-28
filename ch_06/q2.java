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
        long sum = 0;
        long temp = n % 10;
        sum += temp;
        n /= 10;
        
        return (int) sum;
    }
}
