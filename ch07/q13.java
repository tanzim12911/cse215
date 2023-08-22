package ch07;

import java.util.Scanner;

public class q13 {
    static final int SIZE = 100;
    public static void main(String[] args) {
        int[] numList = new int[SIZE];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to exclude (1 to 54):");
        for (int i = 0; i < numList.length; i++ ) {
            numList[i] = sc.nextInt();
        }

    }

    public static int getRandom(int[] array) {
        int numRandom = (int) (1 + Math.random() * 53);

        for (int i = 0; i < array.length; i++) {
            if (numRandom == array[i])
                break;
        }
        getRandom(array);
        return numRandom;
    }
}
