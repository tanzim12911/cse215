package xEXERCISE_MID.w3Arrays;

public class q6 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int key = 77;

        System.out.println("Index of " + key + " is " + indexOfElement(arr, key));

    }

    public static int indexOfElement(int[] array, int n) {
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                index = i;
            }
        }

        return index;
    }
}
