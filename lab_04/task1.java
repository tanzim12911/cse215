package lab_04;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int sum = 0;
        System.out.print("Enter 6 integers: ");
        for (int i = 0; i < 6; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        double average = sum / 6;
        System.out.println("The average is " + average);

        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (array[i] > average)
                count++;
        }

        double percentage = count * 100 / 6;
        System.out.println("The percentage of numbers that are above that average is " + percentage + "%");
    }
}
