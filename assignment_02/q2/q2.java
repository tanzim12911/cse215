package assignment_02.q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of the string is: ");
        int size = sc.nextInt();
        char[] string = new char[size];

        System.out.print("Enter your NSU ID: ");
        
        for (int i = 0; i < size; i++) {
            string[i] = sc.next().charAt(i);
        }
        
        
        MyString1 s1 = new MyString1();
        s1.string = id;

        System.out.println("Number at 8th digit is: " + s1.charAt(8));

        System.out.println("Last 3 digits of my NSU ID is: " + s1.subString());

        System.out.println("Uppercase of mystring is: " + s1.toUpperCase());

        if(s1.charAt(8) == 6)
            System.out.println("8th digit of my NSU ID is 6. I must make it 0 before graduating from NSU");
        else
            System.out.println("8th digit of my NSU ID is already 0.");

    }

    
}
