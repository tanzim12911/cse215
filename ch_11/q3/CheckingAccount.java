package ch_11.q3;


public class CheckingAccount extends Account {
    private double overDraftLimit;

    CheckingAccount() {
        overDraftLimit = 50;
    }

    CheckingAccount(int id, double balance) {
        super(id, balance);
    }


}
