package exercise.w3Arrays;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println("Original Numeric Array: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        sortNumericArr(arr1);
        System.out.println("Sorted Numeric Array: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    

    public static void sortNumericArr(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
        for(int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        }
    }
}

}


