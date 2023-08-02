package ch_03;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (H/T): ");
        String guess = sc.nextLine().charAt(0);

        int guess_conv;

        if (guess == 'H')
            guess_conv = 0;
        else   
            guess_conv = 1;
        
        int flip = (int) (Math.random());

        if (guess_conv == flip)
            System.out.println("Your guess is Correct!");
        else
            System.out.println("Your guess if worng");


    }
}
