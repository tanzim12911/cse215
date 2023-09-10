package lab_03;

import java.util.Scanner;

public class task2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String s1: ");
        String s1 = sc.next();

        System.out.print("Enter String s2: ");
        String s2 = sc.next();
        
        for (int i = 0, j = s1.length() - s2.length(); i < s2.length(); i++, j++) {
            if (s1.charAt(i) == s2.charAt(i))
                System.out.println("The string \"apple\" starts with \"app\"");
            else if (s1.charAt(j) == s2.charAt(i))
                System.out.println("The string \"apple\" ends with \"app\"");
            else
                System.out.println("The string \"apple\" does not start or ends with \"app\"");
        }
    }
    
}

