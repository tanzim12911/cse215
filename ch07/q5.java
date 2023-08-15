package ch07;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int count = 0;
        int [] numList = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++)
        {
            int temp = sc.nextInt();
            for (int j = 9; j >= 0; j--)
            {
                if (temp != numList[j]) {
                    numList[i] = temp;
                    count++;
                }
            }
        }

        System.out.println("The number of distinct number is " + count);

        for (int i = 0; i < 10; i++)
        {
            System.out.print(numList[i] + " ");
        }
    }
}
