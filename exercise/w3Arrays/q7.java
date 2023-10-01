package exercise.w3Arrays;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int key = 77;

        System.out.println("New array: ");

        int[] result = removeElement(arr, key);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i] + " ");
        }


    }

    public static int[] removeElement(int[] array, int n) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (n != array[i]) {
                arr[index] = array[i];
                index++; 
            }
        }
    }
}
