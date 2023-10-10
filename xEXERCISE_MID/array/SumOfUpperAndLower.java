package xEXERCISE_MID.array;

import java.util.Scanner;

public class SumOfUpperAndLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int sumUpper = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                sumUpper += mat[i][j];
            }
        }

        System.out.println("Sum of upper triangle: " + sumUpper);

        int sumLower = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sumLower += mat[i][j];
            }
        }

        System.out.println("Sum of lower triangle: " + sumLower);



    }

}
