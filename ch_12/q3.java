package ch_12;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        System.out.println("Enter an index: ");

        try {
            System.out.println(returnIndexElement(arr, sc.nextInt()));
        } catch (ArrayIndexOutOfBoundsException aofbe) {
            System.out.println("Out of Bounds");
        }
    }

    static int returnIndexElement(int[] a, int n) throws ArrayIndexOutOfBoundsException {
        if (n >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return a[n];
    }
}
