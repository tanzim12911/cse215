package ch_06;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(isPalindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
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
    
    public static boolean isPalindrome(int number) {
        boolean status = false;

        if (reverse(number) == number)
            status = true;
        else
            status = false;

        return status;
    }
}
