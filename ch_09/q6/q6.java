package ch_09.q6;

import java.util.Random;

public class q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100000];

        for (int i = 0; i < 100000; i++) {
            array[i] = rand.nextInt(10000);
        }

        StopWatch watch = new StopWatch();

        watch.start();

        selectionSort(array);

        watch.stop();

        System.out.println("Execution time in ms: " + watch.getElaspedTime());
        
    }

    static int[] selectionSort(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

            }
        }

        return newList;

    }
}
