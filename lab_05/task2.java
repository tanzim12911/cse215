package lab_05;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        

    }

    static boolean isPalindrome(String yourString) {
        String reverse = reverseString(yourString);

        if (yourString.equals(reverse))
            return true;

        return false;
    }

    static String reverseString(String yourString) {
        String new_str = "";
        char ch;

        for (int i = 0; i < yourString.length() - 1; i++) {
            ch = yourString.charAt(i);
            new_str = ch + new_str;
        }

        return new_str;
    }
}
