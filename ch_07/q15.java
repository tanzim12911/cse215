package ch_07;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numList[i] =sc.nextInt();
        }

        int[] finalList = eliminateDuplicates(numList);

        for (int x : finalList) {
            System.out.print(x + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        
        java.util.Arrays.sort(list);
        int x = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) {
                temp[x] = list[i];
                x++;
            }
        }

        int[] result = new int[x];

        for (int i = 0; i < x; i++) {
            result[i] = temp[i];
        }

        return result;
    }

}
