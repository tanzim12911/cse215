package exercise.array;

import java.util.Arrays;

public class RemoveAllOccuranceofAnElement {
    public static void main(String[] args) {
        int[] array = {10, 20 , 30, 10, 40, 10};

    }

    public static int[] RemoveOccurence(int[] arr, int key) {
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[index] = arr[i];
                index++;
            }
        }

        return Arrays.copyOf(arr, index);
    }
}
