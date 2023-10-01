package exercise.w3Arrays;

public class q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < arr.length - 1; i ++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1)
                System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
