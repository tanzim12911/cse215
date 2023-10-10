package lab08.Task4;

public class Employee extends Person {
    private String id;
    private String departement;
    private double salary;
    
    public Employee() {
    }
    public Employee(String name, String gender, int age) {
        super(name, gender, age);
    }
    public Employee(String name, String gender, int age, String id, String departement, double salary) {
        super(name, gender, age);
        this.id = id;
        this.departement = departement;
        this.salary = salary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDepartement() {
        return departement;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "id: " + id + "\ndepartment: " + departement + "\nsalary: " + salary;
    }
}
