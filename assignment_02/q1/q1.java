package assignment_02.q1;

import java.util.Random;

public class q1 {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        Random random = new Random();

        final int size = 500000;
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50000);
        }

        sw.start();

        bubbleSort(array);

        sw.stop();

        System.out.println("Time taken to sort an integer array of 5 lakh integers is: " + sw.getElaspedTime());
    }

    public static void bubbleSort(int[] a) {

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }
}
