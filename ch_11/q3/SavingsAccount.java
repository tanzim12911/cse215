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

    public void withdraw(double amount) {
        if(amount > getBalance()) {
            System.out.println("You do not have enough balance.");
        }
        else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Overdraft protection not included";
    }
}
