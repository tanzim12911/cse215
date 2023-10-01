package exercise.w3Arrays;

public class q7 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int key = 77;

        System.out.println("New array: ");

        removeElement(arr, key);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


    }

    public static void removeElement(int[] array, int n) {
        
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                array[i] = (Integer) null;
            }
        }
    }
}
