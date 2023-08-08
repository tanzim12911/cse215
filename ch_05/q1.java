package ch_05;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int sum = 0, count_num = 0, count_pos = 0, count_neg = 0;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (num != 0) {

            num = sc.nextInt();
            
            if (num > 0)
                count_pos++;
            else
                count_neg++;

            sum += num;
            count_num++;
        }

        double avg = sum / count_num;

        System.out.println("The number of positives is " + count_pos);
        System.out.println("The number of negatives is " + count_neg);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + avg);

    }
}
