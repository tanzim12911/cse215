package assignment_01;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of courses: ");
        int courseNum = sc.nextInt();
        sc.nextLine();
        
        String[] gradeList = new String[courseNum];
        System.out.print("Enter your grades: ");
        for (int i = 0; i < courseNum; i++) {
            gradeList[i] = sc.nextLine();
        }
        
        double cgpa = gpaFall2022(courseNum, gradeList);

        System.out.println("Your GPA for FALL2022 is " + cgpa);

    }

    static double gpaFall2022(int noOfCourses, String[] grade) {
        
        double total_gpa = 0;
        
        for (int i = 0; i < grade.length; i++) {
            if (grade[i].equals("A"))
                total_gpa += 4.0;
            else if (grade[i].equals("A-"))
                total_gpa += 3.7;
            else if (grade[i].equals("B+"))
                total_gpa += 3.3;
            else if (grade[i].equals("B"))
                total_gpa += 3.0;
            else if (grade[i].equals("B-"))
                total_gpa += 2.7;
            else if (grade[i].equals("C+"))
                total_gpa += 2.3;
            else if (grade[i].equals("C"))
                total_gpa += 2.0;
            else if (grade[i].equals("C-"))
                total_gpa += 1.7;
            else if (grade[i].equals("D+"))
                total_gpa = 1.3;
            else if (grade[i].equals("D"))
                total_gpa += 1.0;
            else
                total_gpa += 0.0;
        }


        return (total_gpa / noOfCourses);
    }
}
