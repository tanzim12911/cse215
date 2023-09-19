package ch_11.q3;

import ch_09.q7.Account;

public class CheckingAccount extends Account {
    private double overDraftLimit;

    CheckingAccount() {
        overDraftLimit = 50;
    }

    CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + overDraftLimit) {
            System.out.println("The amount requested to withdraw exceeds overdraft limit");;
        }
        else {
            setBalance(getBalance() - amount);
        }   
    }

    @Override
    public String toString() {
        return super.toString() + " Overdraft protection upto " + overDraftLimit;
    }
}
