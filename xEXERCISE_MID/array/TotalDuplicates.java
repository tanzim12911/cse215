package exercise.array;

import java.util.Scanner;

public class TotalDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            if(array[i] == array[i + 1]) {
                count++;
            }
        }

        System.out.println("Total no. of duplicates : " + count);


    }
}
