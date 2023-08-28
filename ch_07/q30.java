package ch_07;

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int size = sc.nextInt();
        int[] values = new int[size];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        boolean status = isConsecutiveFour(values);

        if (status)
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        boolean status = false;

        for (int i = 0; i < values.length; i++) {
            for (int j = 1; j < 3; j++) {
                if (values[i] == values[j])
                    status = true;
                else
                    status = false;
            }
        }
        return status;
    }
}
