package assignment_02.q2;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your NSU ID: ");
        String id = sc.next();
        
        MyString1 s1 = new MyString1(id);
        MyString1 s2 = new MyString1("Test123");

        System.out.println("Number at 8th digit is: " + s1.charAt(7));

        System.out.println("Is this string equal to 'Test123'? : " + s1.equals(s2));

        System.out.println("Last 3 digits of my NSU ID is: " + s1.subString(7, 10));

        System.out.println("Uppercase of my string is: " + s1.toUpperCase());

        if(s1.charAt(7) == '6')
            System.out.println("8th digit of my NSU ID is 6. I must make it 0 before graduating from NSU");
        else
            System.out.println("8th digit of my NSU ID is already 0.");

    }

    
}
