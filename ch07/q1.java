package ch07;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int stuNum = sc.nextInt();

        int [] numList = new int[stuNum];
        char [] gradeList = new char[stuNum];
        int maxNum = 0;

        System.out.print("Enter " + stuNum + "scores: ");
        
        for (int i = 0; i < stuNum; i++) {
            numList[i] = sc.nextInt();

            if (numList[i] > maxNum)
                maxNum = numList[i];
        }

        for (int i = 0; i < stuNum; i++) {
            if (numList[i] >= maxNum - 10)
                gradeList[i] = 'A';
            else if (numList[i] >= maxNum - 20)
                gradeList[i] = 'B';
            else if (numList[i] >= maxNum - 30)
                gradeList[i] = 'C';
            else if (numList[i] >= maxNum - 40)
                gradeList[i] = 'D';
            else
                gradeList[i] = 'F';
        }

        for (int i = 0; i < stuNum; i++) {
            System.out.println("Student " + i + " score is " + numList[i] + " and " + "grade is " + gradeList[i]);
        }



    }
}
