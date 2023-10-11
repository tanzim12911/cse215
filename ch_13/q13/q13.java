package ch_13.q13;

public class q13 {
    public static void main(String[] args) {
        Course c1 = new Course("CSE115");

        

        c1.addStudent("Jinx");
        c1.addStudent("Ekko");
        c1.addStudent("Powder");
        
        System.out.println(c1.getCourseName());
        System.out.println(c1.getNumberOfStudents());

        String[] list = c1.getStudents();

        for(String x: list) {
            System.out.println(x + " ");
        }
        
        
        c1.dropStudent("Ekko");
        
        list = c1.getStudents();

        for(String x: list) {
            System.out.println(x);
        }
        
    }

}
