package ch_10.q9;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

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

    public void dropStudent(String student) {
        for(int i = 0; i < 100; i++) {
            if(students[i].equals(student)) {
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

    public void clear() {
        for(int i = 0; i < 100; i++) {
            students[i] = null;
        }
    }
}
