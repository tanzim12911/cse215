package xEXERCISE_FINAL.Inheritance.PersonEmployee;

public class FullTimeEmployee extends Employee {
    private double basic;
    private double allowance;

    FullTimeEmployee() {
    }
    FullTimeEmployee(double basic, double allowance) {
        this.basic = basic;
        this.allowance = allowance;
    }
    FullTimeEmployee(String name, int age, String address, double basic, double allowance) {
        super(name, age, address);
        this.basic = basic;
        this.allowance = allowance;
    }
    
    
    public double getBasic() {
        return basic;
    }
    public void setBasic(double basic) {
        this.basic = basic;
    }
    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
    @Override
    public String toString() {
        return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + "]";
    }

    public double salary() {
        return basic + (basic * allowance / 100);
    }
    
}
