package assignment_02.q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of the string is: ");
        int length = sc.nextInt();

        System.out.print("Enter your NSU ID: ");
        String id = sc.next();
        
        MyString1 s1 = new MyString1(id);
        MyString1 s2 = new MyString1("Test123");

        System.out.println("Number at 8th digit is: " + s1.charAt(7));

        System.out.println("Is this string equal to 'Test123'? : " + s1.equals(s2));

        System.out.print("Last 3 digits of my NSU ID is: ");
        MyString1 lastDigits = s1.subString(length - 3, length);
        for (int i = 0; i < lastDigits.length(); i++) {
			System.out.print(lastDigits.charAt(i));		
		}
        System.out.println();
        

        System.out.print("Uppercase of my string is: ");
		MyString1 upper = s1.toUpperCase();
		for (int i = 0; i < upper.length(); i++) {
			System.out.print(upper.charAt(i));		
		}
        System.out.println();

        if(s1.charAt(7) == '6')
            System.out.println("8th digit of my NSU ID is 6. I must make it 0 before graduating from NSU");
        else
            System.out.println("8th digit of my NSU ID is already 0.");

    }

    
}
