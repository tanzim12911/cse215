package ch_08;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < 4; i++) {
            for (int j =0; j < 4; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(mat));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;
    }
}
