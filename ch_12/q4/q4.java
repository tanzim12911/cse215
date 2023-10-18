package ch_12.q4;

public class q4 {
    public static void main(String[] args) {
        Loan ln = new Loan();
        
        try {
            ln.setAnnualInterestRate(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

        try {
            ln.setNumberOfYears(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            ln.setLoanAmount(-500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
