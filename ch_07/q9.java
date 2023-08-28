package ch_07;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        double[] numList = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        
        for (int i = 0; i < 10; i++) {
            numList[i] = sc.nextDouble();
        }

        System.out.println("The minumum number is: " + min(numList));

    }

    public static double min(double[] array) {
        double numMin = array[0];

        for (int i = 1; i < array.length; i++) {

            if(numMin > array[i]) {
                numMin = array[i];
            }
        }
        return numMin;
    }
}
