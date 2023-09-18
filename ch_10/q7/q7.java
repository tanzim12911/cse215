package ch_10.q7;

import ch_09.q7.Account;

public class q7 {
    public static void main(String[] args) {
        Account[] accountList = new Account[10];
        
        
    }

    public static Account[] createAccounts(Account[] acc) {
        for(int i = 0; i < acc.length; i++) {
            acc[i] = new Account();
        }
    }
}
