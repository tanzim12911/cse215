package ch_11.q2;

import ch_10.q14.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    Employee() {

    }

    Employee(String office, double salary, MyDate dateHired) {
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
    public MyDate getDateHired() {
        return dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
    }

    
}
