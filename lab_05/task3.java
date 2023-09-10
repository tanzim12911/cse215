package lab_05;

import java.util.Scanner;

public class task3 {

    static double balance = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Balance");
        System.out.println("4.Exit");
        
        int n;
        
        do {
            System.out.println("Select an option: ");
            n = sc.nextInt();
            
            if (n == 1) {
                System.out.println("Enter deposit amount: ");
                double d_amount = sc.nextDouble();
                deposit(d_amount);
            }
            else if (n == 2) {
                System.out.println("Enter withdraw amount: ");
                double w_amount = sc.nextDouble();
                if(w_amount < balance)
                    withdraw(w_amount);
                else
                    System.out.println("You do not have enough balance.");
                
                
            }
            else if (n == 3) {
                System.out.println("Balance: " + balance);
            }
            else
                System.out.println("Exiting program");
            
            
        } while(n != 4);
    }
    
    
    
    static double deposit(double amount) {
        balance += amount;
        return balance;
    }
    
    static double withdraw(double amount) {
        balance -= amount;
        return balance;
    }
    
}
