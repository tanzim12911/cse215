package ch07;

import java.util.Scanner;

public class q13 {
    static final int SIZE = 3;
    public static void main(String[] args) {
        int[] numList = new int[SIZE];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to exclude (1 to 54): ");
        for (int i = 0; i < numList.length; i++ ) {
            numList[i] = sc.nextInt();
        }
        System.out.print("Random number: " + getRandom(numList));
    }

    public static int getRandom(int[] array) {
        int numRandom = 0;

        for (int i = 0; i < array.length; i++) {
            numRandom = (int) (1 + Math.random() * 53);
            if (numRandom == array[i])
                continue;
        }
        return numRandom;
    }
}
