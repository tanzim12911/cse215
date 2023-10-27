package ch_11.q2;

import ch_10.q14.MyDate;

public class Staff extends Employee{
    private String title;

    Staff() {

    }

    Staff(String title) {
        this.title = title;
    }

    Staff(String office, double salary, MyDate dateHired) {
        
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [title=" + title + "]";
    }

    
}
