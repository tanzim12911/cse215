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

        int[] result = indexOfThreeConsecutive(array);

        System.out.println("Output: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }

    static int[] indexOfThreeConsecutive(int[] a) {
        int count = 1;
        int num = a[0];
        int[] temp = new int[10];
        int x = 0;

        for (int i = 1; i < a.length; i++) {
            if (num == a[i]) {
                count++;
            }
            else {
                num = a[i];
                count = 1;
            }

            if(count == 3) {
                    temp[x] = i;
                    x++;
                }
        }
        
        /*int[] result = new int[x];
        
        for (int i = 0; i < x; i++) {
            result[i] = temp[i];
        }*/


        return temp;
    }
}