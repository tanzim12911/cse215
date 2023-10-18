package ch_12.q3;

public class q3 {
    public static void main(String[] args) {
        Loan ln = new Loan();
        
        try {
            ln.setAnnualInterestRate(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            ln.setNumberOfYears(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            ln.setLoanAmount(-500);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
