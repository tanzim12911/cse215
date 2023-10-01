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

        Arrays.sort(arr1);
        System.out.println("Sorted Numeric Array: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    

    public static void sortNumericArr(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}

}


