package ch_11.q2;

import ch_10.q14.MyDate;

public class q2 {
    public static void main(String[] args) {
        Person p = new Person("Rahim", "Uttara", 01711111111, "rarim@gmail.com");
        
        Student s = new Student(Student.FRESHMAN);
        s.setName("Karim");
        
        Employee e = new Employee("ADM101", 25000, new MyDate());
        e.setName("Rafiq");
        
        Faculty f = new Faculty("SAC999", 250000, new MyDate(), "RA: 10:30AM", "Professor");
        f.setName("Dr. Ahmed");

        Staff st = new Staff("ADM201", 50000, new MyDate(), "Accountant");
        st.setName("Mr. Kabir");

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());

    }
}
