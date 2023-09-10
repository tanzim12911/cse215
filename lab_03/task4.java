package lab_03;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String s1: ");
        String s1 = sc.next();

        System.out.print("Enter String s2: ");
        String s2 = sc.next();
        
        // equals
        if (s1.equals(s2))
            System.out.println("The string " + s1 + " and " + s2 + " are equal");
        else
            System.out.println("The string " + s1 + " and " + s2 + " are not equal");

        
        // equals after ignoring case
        if (s1.equalsIgnoreCase(s2))
            System.out.println("The string " + s1 + " and " + s2 + " are equal ignoring case");
        else
            System.out.println("The string " + s1 + " and " + s2 + " are not equal ignoring case");

        
        // startswith & endswith
        if (s1.startsWith(s2))
            System.out.println("The string " + s1 + " starts with " + s2);
        else if (s1.endsWith(s2))
            System.out.println("The string " + s1 + " ends with " + s2);
        else
            System.out.println("The string " + s1 + " does not start or ends with " + s2);

        if (s2.startsWith(s1))
            System.out.println("The string " + s2 + " starts with " + s1);
        else if (s2.endsWith(s1))
            System.out.println("The string " + s2 + " ends with " + s1);
        else
            System.out.println("The string " + s2 + " does not start or ends with " + s1);
    }


}
