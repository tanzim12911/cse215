package ch_11.q3;

import ch_09.q7.Account;

public class q3 {
    public static void main(String[] args) {
        Account acc1 = new Account(2311730, 1999);
        SavingsAccount s_acc = new SavingsAccount();
        CheckingAccount c_acc = new CheckingAccount();

        acc1.toString();
        s_acc.toString();
        c_acc.toString();
    }
}
