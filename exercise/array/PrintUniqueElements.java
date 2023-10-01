package exercise.array;

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 5};
        UniqueElementsDisplay(array);
    }

    public static void UniqueElementsDisplay(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] != arr[j]) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }

    
}


