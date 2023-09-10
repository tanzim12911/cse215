package lab_04;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] fibArray = new int[n];

        fibArray[0] = 0;
        fibArray[1] = 1;
        fibArray[2] = 1;

        for (int i = 3; i < n; i++) {
            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibArray[i] + " ");
        }



    }
}
