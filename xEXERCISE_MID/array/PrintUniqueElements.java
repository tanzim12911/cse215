package exercise.array;

import java.util.Arrays;

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 5};
        int[] result = UniqueElementsDisplay(array);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] UniqueElementsDisplay(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] != arr[j]) {
                    arr[index] = arr[i];
                    index++;
                }
            }
        }

        return Arrays.copyOf(arr, index);
    }

    
}


