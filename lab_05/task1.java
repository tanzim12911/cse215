package lab_05;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("Number of vowels: " + countVowels(str));
    }

    public static int countVowels(String yourString) {
        int count = 0;

        for(int i = 0; i <= yourString.length() - 1; i++) {
            if (isVowel(yourString.charAt(i)))
                count++;
        }

        return count;
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
        || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
        || c == 'U') {
            return true;
        }

        return false;
    }
}
