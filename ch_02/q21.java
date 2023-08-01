package ch_02;

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200.0;

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
