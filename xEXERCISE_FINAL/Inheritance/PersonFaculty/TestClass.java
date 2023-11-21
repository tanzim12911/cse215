package xEXERCISE_FINAL.Inheritance.PersonFaculty;

public class TestClass {
    public static void main(String[] args) {
        Faculty f = new Faculty("HSM", "Lecturer");

        f.setName("Sahriar Hussain");
        f.setAge(38);
        f.setSalary(150000);

        f.toString();

    }
}
