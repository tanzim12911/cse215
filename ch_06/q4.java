package ch_06;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println(num + " in reverse: " + reverse(num));

    }

    public static int reverse(int number) {
        int reverse = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return reverse;
    }
}
