package assignment_01;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = sc.nextLine();

        boolean status = isValidPassword(pass);

        if (status == true)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is invalid");
    }

    static boolean isValidPassword(String password) {

        boolean status = false;
        
        if (password.length() >= 6) 
        {
            if (java.lang.Character.isDigit(password.charAt(password.length() - 1)))
            {
                for (int i = 0; i < password.length(); i++) 
                {
                    if (java.lang.Character.isLetter(i)) 
                    {
                        status = true;
                    }
                }
            }
        }
        else
            status = false;
        
        return status;
    }
} 
