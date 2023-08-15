package ch07;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the scores: ");
        double [] numList = new double[100];
        int count = 0, countAbove = 0, countBelow = 0, countEqual = 0;
        double sum = 0, avg;
        
        while (true) {
            numList[count] = sc.nextDouble();

            if (numList[count] < 0)
                break;

            count++;
        }

        System.out.println(count);

        for (int i = 0; i < count + 1; i++)
        {
            sum += numList[i];
        }

        avg = sum / count;

        System.out.println(avg);

        for (int i = 0; i < count + 1; i++)
        {
            if (numList[i] > avg)
                countAbove++;
            else if (numList[i] == avg)
                countEqual++;
            else
                countBelow++;
        }

        System.out.println("Scores Equal to Average: " + countEqual);
        System.out.println("Scores Above Average: " + countAbove);
        System.out.println("Scores Below Average: " + countBelow);


    }
}
