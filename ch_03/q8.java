package ch_03;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        int temp;

        if (num_1 > num_2); {
            temp = num_1;
            num_1 = num_2;
            num_2 = temp;
        }
        if (num_2 > num_3) {
            temp = num_2;
            num_2 = num_3;
            num_3 = temp;
        }

        System.out.println("Non-decreasing order: " + num_1+ " " + num_2 + " " + num_3);

    }
}
