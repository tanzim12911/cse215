package ch_06;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

    }

    public static void printMatrix(int n) {
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 2);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
