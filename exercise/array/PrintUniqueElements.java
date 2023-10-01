package exercise.array;

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 5};
        UniqueElementsDisplay(array);
    }

    public static void UniqueElementsDisplay(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    
}


