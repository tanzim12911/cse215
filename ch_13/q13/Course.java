package ch_13.q13;

public class Course implements Cloneable {
    
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String name) {
        for(int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                students[i] = null;
            }
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }
}
