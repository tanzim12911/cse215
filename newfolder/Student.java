package newfolder;

public class Student extends Person {
    int id;

    Student(String name, int age, int id) {
        super.name = name;
        super.age = age;
        this.id = id;
    }

    void display() {
        System.out.println("Name:" +name);
        System.out.println("Name:" +age);
        System.out.println("ID:" +id);  
    }
}
