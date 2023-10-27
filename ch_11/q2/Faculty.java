package ch_11.q2;

public class Faculty extends Employee {
    private String officeHour;
    private String rank;

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
