package xEXERCISE_FINAL.Inheritance.PersonEmployee;

public class PartTimeEmployee extends Employee {
    private double hours;
    private double rate;
    
    PartTimeEmployee() {
    }
    
    PartTimeEmployee(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }
    PartTimeEmployee(String name, int age, String address, double hours, double rate) {
        super(name, age, address);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + "]";
    }

    public double salary() {
        return hours * rate;
    }
  
}
