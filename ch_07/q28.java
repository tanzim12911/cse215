package ch_07;

import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int [] numList = new int[10];
        for (int i = 0; i < 10; i++) {
            numList[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println("All combination of " + numList[i] + " and " + numList[i + 1]);
            System.out.println(numList[i] + " " + numList[i + 1]);
            System.out.println(numList[i + 1] + " " + numList[i]);
        }
    }
}
