package exercise.w3Arrays;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size + 1];

        System.out.print("Enter " + size + "elements: ");

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Value to be inserted: ");
        int value = sc.nextInt();

        System.out.print("Enter the position: ");
        int p = sc.nextInt();

        System.out.println("Current Elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        //insertElement(array, value, p);
        
        for(int i = array.length - 1; i > p; i--) {
            array[i] =  array[i - 1];
        }

        array[p] = value;

        System.out.println("Elements after insert: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

    /*
    public static void insertElement(int[] array, int value, int position) {
        for(int i = array.length - 1; i > position; i--) {
            array[i] =  array[i - 1];
        }

        array[position] = value;
    }

    */
}
