package xEXERCISE_FINAL.Inheritance.PersonEmployee;

public class TestClass {
    public static void main(String[] args) {
        PartTimeEmployee e1 = new PartTimeEmployee(25, 50);
        FullTimeEmployee e2 = new FullTimeEmployee(15000, 25);

        System.out.println("PartTime Salary: " + e1.salary());
        System.out.println("FullTime Salary: " + e2.salary());
    }
}
