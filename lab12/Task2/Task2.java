package lab12.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];

        for(int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }

        System.out.print("Enter an integer as index: ");
        int index = sc.nextInt();

        try{
            System.out.println("Element[" + index + "] = " + arr[index]);

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of array size");
        }
    }
}
