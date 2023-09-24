package assignment_02.q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your NSU ID: ");
        String id = sc.next();

        MyString1 s1 = new MyString1(id);

        System.out.println("Number at 8th digit is: " + s1.charAt(7)); // Note: Arrays are 0-indexed.

        // Check if the ID length is at least 10 characters before extracting a substring.
        if (s1.length() >= 10) {
            System.out.println("Last 3 digits of my NSU ID is: " + s1.subString(s1.length() - 3, s1.length()));
        } else {
            System.out.println("The NSU ID is too short to extract the last 3 digits.");
        }

        System.out.println("Uppercase of mystring is: " + s1.toUpperCase());

        if (s1.charAt(7) == '6') {
            System.out.println("8th digit of my NSU ID is 6. I must make it 0 before graduating from NSU");
        } else {
            System.out.println("8th digit of my NSU ID is already 0.");
        }
    }
}
