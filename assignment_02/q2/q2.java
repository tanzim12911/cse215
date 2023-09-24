package assignment_02.q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] id = {'2', '3', '2', '1', '8', '4', '2', '6', '4', '2'};
        
        MyString1 s1 = new MyString1();
        s1.string = id;

        System.out.println("Number at 8th digit is: " + s1.charAt(8));

        System.out.println("Last 3 digits of my NSU ID is: " + s1.subString(7, 9));

    }

    
}
