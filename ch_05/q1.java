package ch_05;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int num, sum = 0,count_pos = 0, count_neg = 0;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner sc = new Scanner(System.in);

        while (num != 0) {
            
            num = sc.nextInt();

            if (num > 0)
                count_pos++;
            else
                count_neg++;

            sum += num;
        }

    }
}
