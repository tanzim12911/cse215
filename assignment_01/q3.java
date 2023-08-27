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
        
        System.out.println(courseNum);
        
        double cgpa = gpaFall2022(courseNum, gradeList);

        System.out.println("Your GPA for FALL2022 is " + cgpa);

    }

    static double gpaFall2022(int noOfCourses, String[] grade) {
        
        double total_gpa = 0;
        
        for (int i = 0; i < grade.length; i++) {
            switch (grade[i]) {
                case "A":
                    total_gpa += 4.0;
                    break;
                case "A-":
                    total_gpa += 3.7;
                    break;
                case "B+":
                    total_gpa += 3.3;
                    break;
                case "B":
                    total_gpa += 3.0;
                    break;
                case "C+":
                    total_gpa += 2.7;
                    break;
                case "C-":
                    total_gpa += 1.7;
                    break;
                case "D+":
                    total_gpa += 1.3;
                    break;
                case "D":
                    total_gpa += 1.0;
                    break;
                case "F":
                    total_gpa += 0.0;
                    break;
            }
        }


        return (total_gpa / noOfCourses);
    }
}
