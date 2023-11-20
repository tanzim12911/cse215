package ch_11.q8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    Account(String name, int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        dateCreated = new Date();
    }

    public int getID() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setID(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterest() / 100;
    }
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, name));
    }
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, name));
    }




}
