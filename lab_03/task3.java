package lab_03;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int count = 0;
        int index;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (isVowel(str.charAt(i))) {
                count++;

                if(count == 2) {
                    index = i;
                    break;
                }
            }
        }

        System.out.println("Index of second last vowel: " + index);
    }

    static boolean isVowel(char ch) {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           return true;
        else
            return false;
    }


}
