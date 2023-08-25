package assignment_01;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of elements in the array: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        System.out.print("Enter all the " + size + " array elements :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (key == array[i])
                count++;
        }

        System.out.println(key + " appears " + count + " no. times.");
    }
}
