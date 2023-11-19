package ch_11.q8;

public class q8 {
    public static void main(String[] args) {
        Account ac = new Account("George", 1122, 1000);

        ac.setAnnualInterestRate(1.5);

        ac.deposit(30);
        ac.deposit(40);
        ac.deposit(50);

        ac.withdraw(5);
        ac.withdraw(4);
        ac.withdraw(2);

        System.out.println("Name: " + ac.getName());
        System.out.println("Interest Rate: " + ac.getAnnualInterestRate());
        System.out.println("Balance: " + ac.getBalance());
        System.out.println("Transaction Summary: ");
        System.out.println(ac.getTransactions());
        


    }
}
