package ch_08;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(mat, i));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumColumn = 0;
        for (int i = 0; i < m.length; i++) {
            sumColumn += m[i][columnIndex];
        }
        return sumColumn;
    }
}
