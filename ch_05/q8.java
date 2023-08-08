package ch_05;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        String stuName, stuNameHighest;
        int stuScore, stuScoreHighest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter Name of Student " + i + ": ");
            stuName = sc.nextLine();
        
            System.out.print("Enter Score of Student " + i + ": ");
            stuScore = sc.nextInt();
            sc.nextLine(); // Consume the newline character
        
            if (stuScore > stuScoreHighest) {
                stuScoreHighest = stuScore;
                stuNameHighest = stuName;
            }
        }
        
    }
}
