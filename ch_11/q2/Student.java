package ch_11.q2;

public class Student extends Person {
    protected final String STATUS;

    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String SENIOR = "senior";
    public static final String JUNIOR = "junior";

    Student(String status) {
        this.STATUS = status;
    }

    Student(String name, String address, String phoneNum, String emailAdress, String status) {
        super(name, address, phoneNum, emailAdress);
        this.STATUS = status;

    }

    public String toString() {
        return "Student.class { " + "Name= " + super.getName() + " }"; 
    }
}
