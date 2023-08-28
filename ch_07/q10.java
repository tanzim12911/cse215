package ch_07;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        double[] numList = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        
        for (int i = 0; i < 10; i++) {
            numList[i] = sc.nextDouble();
        }

        if (numList.length > 1)
            System.out.println("The index of minumum number is: " + indexOfSmallestElement(numList));
        else
            System.out.println("Error: The number of element in the array is 1");

    }

    public static double indexOfSmallestElement(double[] array) {
        double numMin = array[0];
        int numMinIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if(numMin > array[i]) {
                numMin = array[i];
                numMinIndex = i;
            }
        }
        return numMinIndex;
    }

}
