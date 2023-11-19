package ch_11.q8;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type; // The type of the transaction, such as 'W' for withdrawal, 'D' for deposit
    private double amount;
    private double balance;
    private String description;


    Transaction() {

    }
    Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }

    
}
