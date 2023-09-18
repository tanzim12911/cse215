package ch_10.q9;

public class q9 {
    public static void main(String[] args) {
        Course c1= new Course("CSE215");

        c1.addStudent("Jawadul");
        c1.addStudent("Karim");
        c1.addStudent("Tanzim");

        c1.dropStudent("Tanzim");

        String[] students = c1.getStudents();

        for(int i = 0; i < 3; i++) {
            System.out.println("Students in the course: " + students[i]);
        }
    }
}
