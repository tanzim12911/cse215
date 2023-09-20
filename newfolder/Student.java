package newfolder;

public class Student extends Person {
    int id;

    Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    void display() {
        System.out.println("Name:" +name);
        System.out.println("Name:" +age);
        System.out.println("ID:" +id);  
    }
}
