package ch_08;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] mat1 = new double[3][3];
        double[][] mat2 = new double[3][3];
        
        System.out.println("Enter matrix1 (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 3; j++) {
                mat1[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter matrix2 (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j =0; j < 3; j++) {
                mat2[i][j] = sc.nextDouble();
            }
        }

        double[][] result = addMatrix(mat1, mat2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j]; 
            }
        }
        return result;
    }

}
