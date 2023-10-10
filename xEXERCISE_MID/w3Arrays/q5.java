package xEXERCISE_MID.w3Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {1789, 2035, 1899, 1456, 2013};

        int key = 2013;

        System.out.println("Contains " + key + ": " + isContained(arr, key));

    }

    public static boolean isContained(int[] array, int n) {
        boolean status = false;
        
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                status = true;
            }
        }

        return status;
    }
}
