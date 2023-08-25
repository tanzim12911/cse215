package assignment_01;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mat[][] = new int[5][5];
        
        System.out.println("Enter a 5-by-5 matrix row by row:");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("lol");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
