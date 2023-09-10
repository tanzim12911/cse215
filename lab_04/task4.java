package lab_04;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Output: ");

        for (int i = 0; i < array.length - 3; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                if (array[j] == array [j + 1] && array[j + 1] == array[j + 2]) {
                    System.out.print(array[j] + " ");
                }

            }
        }
        
        
    }
}
