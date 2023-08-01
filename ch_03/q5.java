package ch_03;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int elapsed_day = sc.nextInt();

        int future_day = (day + elapsed_day) % 7;

        switch (future_day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        
            default:
                break;
        }
    }
}
