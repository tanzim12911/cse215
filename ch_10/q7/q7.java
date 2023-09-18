package ch_10.q7;

import java.util.Scanner;
import ch_09.q7.Account;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accountList = new Account[10];
        
        Account[] accounts = createAccounts(accountList);

        while(true) {
            System.out.print("Enter an id: ");
            int id = sc.nextInt();

            if (id >= 0 && id <= 9) {
                menu(accounts[id]);
            }
            else {
                System.out.println("Incorrect id. Try again.");
                System.out.print("Enter an id: ");
                id = sc.nextInt();
            }


        }
        
    }

    public static Account[] createAccounts(Account[] acc) {
        for(int i = 0; i < acc.length; i++) {
            acc[i] = new Account(i, 100);
        }

        return acc;
    }

    public static void menu(Account a) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");

            System.out.print("Enter a choice: ");
            n = sc.nextInt();

            if (n == 1) {
                System.out.println("Balance: " + a.getBalance());
            }
            else if (n == 2) {
                System.out.println("Enter an amount to withdraw: ");
                a.withdraw(sc.nextDouble());
            }
            else if (n == 3) {
                System.out.println("Enter an amount to deposit: ");
                a.deposit(sc.nextDouble());
            }

        } while(n != 4);
    }
}
