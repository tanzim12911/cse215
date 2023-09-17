package ch_11.q3;

import ch_09.q7.Account;

public class SavingsAccount extends Account {

    public double minBalance;

    SavingsAccount() {
        minBalance = 0;
    }

    SavingsAccount(int id, double balance) {
        super(id, balance);
        this.minBalance = 0;
    }
}
