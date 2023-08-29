package ch_06;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double interest = sc.nextDouble();

        System.out.println("Years           Future value");
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "            " + futureInvestmentValue(amount, interest, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        monthlyInterestRate /= 100;
        return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
    }
}


