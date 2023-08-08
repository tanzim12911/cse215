package ch_05;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int correct = 0;
        Scanner sc = new Scanner(System.in);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            
            int num_1 = (int) ((Math.random() * 14) + 1);
            int num_2 = (int) ((Math.random() * 14) + 1);

            if (num_1 < num_2)
            {
                int temp = num_1;
                num_1 = num_2;
                num_2 = temp;
            }

            System.out.println("What is " + num_1 + " - " + num_2 + " ?" );
            int answer = sc.nextInt();

            if (answer == num_1 - num_2)
            {
                System.out.println("You are correct!");
                correct++;
            }
            else
            {
                System.out.println("Your incorrect! " + num_1 + " - " + num_2 + " should be " + (num_1 - num_2));
            }
        }

        long endTime = System.currentTimeMillis();

        long testTime = endTime - startTime;

        System.out.println("Correct Count: " + correct);
        System.out.println("Test time: " + testTime);


    }
}
