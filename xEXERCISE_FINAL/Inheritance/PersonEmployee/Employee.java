package xEXERCISE_FINAL.Inheritance.PersonEmployee;

public class Employee extends Person {
    private String department;
    private String designation;

    Employee() {
    }

    Employee(String name, int age, String address) {
        super(name, age, address);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
