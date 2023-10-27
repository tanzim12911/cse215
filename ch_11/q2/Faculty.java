package ch_11.q2;

import ch_10.q14.MyDate;

public class Faculty extends Employee {
    private String officeHour;
    private String rank;

    public Faculty(String office, double salary, MyDate dateHired, String officeHour, String rank) {
        super(office, salary, dateHired);
        this.officeHour = officeHour;
        this.rank = rank;
    }
    public Faculty(String officeHour, String rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }
}
