package lab_03;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String s1: ");
        String s1 = sc.next();

        System.out.print("Enter String s2: ");
        String s2 = sc.next();
        
        if (s1.startsWith(s2))
            System.out.println("The string \"apple\" starts with \"app\"");
        else if (s1.endsWith(s2))
            System.out.println("The string \"apple\" ends with \"app\"");
        else
            System.out.println("The string \"apple\" does not start or ends with \"app\"");
    }
    
}
