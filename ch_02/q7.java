package ch_02;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int days = minutes / (60 * 24);
        int years = days / 365;
        days = days % 365;

        System.out.println(minutes + " is apporximately " + years + " years and " + days + " days");
    }
}
