package lab_04;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }


        
    }

    static int[] indexOfThreeConsecutive(int[] a) {
        int count = 1;
        int[] temp = new int[10];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (a[i] == a[j]) {
                    temp[x] = i;
                    x++;
                }
                    
            }
        }
    }
}
