package ch_07;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = sc.nextInt();
        int[] array = new int[size + 1];
        array[0] = size;

        for (int i = 1; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        boolean status = isSorted(array);

        if (status)
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");


    }

    public static boolean isSorted(int[] list) {
        boolean status = false;

        for (int i = 1; i < list.length - 1; i++) {
                if (list[i] > list[i + 1])
                    status = false;
                else   
                    status = true;
        }

        return status;
    }


}
