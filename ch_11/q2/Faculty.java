package ch_11.q2;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHour;
    private String rank;
    
    Faculty (String office, double salary, Date dateHired, String officeHour, String rank) {
        super(office, salary, dateHired);
        this.officeHour = officeHour;
        this.rank =rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Faculty.class { " + "Name= " + super.getName() + " }"; 
    }



}
