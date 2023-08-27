package ch07;

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list 1: ");
        int size1 = sc.nextInt();
        int[] list1 = new int[size1];
        list1[0] = size1;

        for (int i = 1; i < size1; i++) {
            list1[i] = sc.nextInt();
        }

        System.out.print("Enter list 2: ");
        int size2 = sc.nextInt();
        int[] list2 = new int[size2];
        list2[0] = size2;

        for (int i = 1; i < size2; i++) {
            list2[i] = sc.nextInt();
        }

        System.out.println(size1 + " " + size2;
        for (int i = 0; i < size1; i++) {
            System.out.print(list1[i] + " ");
        }
        

        boolean status = equals(list1, list2);

        if(status)
            System.out.println("Two lists are strictly identical");
        else
            System.out.println("Two lists are not strictly identical");

        
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean status = false;

        if (list1.length != list2.length)
            status = false;
        
            for (int i = 1; i < list1.length; i++) {
                if (list1[i] == list2[i])
                    status = true;
        }

        return status;
    }
}
