package assignment_01;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mat[][] = new int[5][5];
        int sumMajor = 0;
        int sumMinor = 0;
        
        System.out.println("Enter a 5-by-5 matrix row by row:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            sumMajor += mat[i][i];
        }
        System.out.println("Sums of the elements in the major diagonal is " + sumMajor);

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                sumMinor += mat[i][j];
            }
        }
        System.out.println("Sums of the elements in the minor diagonal is " + sumMinor);
    }
    
}
