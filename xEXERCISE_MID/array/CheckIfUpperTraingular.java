package exercise.array;

import java.util.Scanner;

public class CheckIfUpperTraingular {
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
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(mat[i][j] == 0)
                    System.out.println("Upper Traingular.");
            }
        }
    }
}
