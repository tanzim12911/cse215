package ch_11.q2;

import java.util.Date;

public class Staff extends Employee {
    private String title;
    
    Staff(String office, double salary, Date dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Staff.class { " + "Name= " + super.getName() + " }"; 
    }

}
