package ch_03;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num_1 = (int) (Math.random() * 100);
        int num_2 = (int) (Math.random() * 100);

        System.out.println("What is " + num_1 + " + " + num_2 + " ?");
        int answer = sc.nextInt();

        if (answer == (num_1 + num_2))
            System.out.println("Your answer is correct!");
        else 
            System.out.println("Your answer is wrong, it should be " + (num_1 + num_2));
    }
}
