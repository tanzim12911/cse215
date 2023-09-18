package ch_11.q2;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    Employee (String office, double salary, Date dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Employee.class { " + "Name= " + super.getName() + " }"; 
    }
}
