package ch_03;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int num_1 = (int) (Math.random() * 10);
        int num_2 = (int) (Math.random() * 10);
        int num_3 = (int) (Math.random() * 10);

        System.out.println("What is " + num_1 + " + " + num_2 + " + " + num_3 + "?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        System.out.println(num_1 + " + " + num_2 + " + " + num_3 + " = " + answer + " is " + (num_1 + num_2 + num_3 == answer));

    } 
    
}
