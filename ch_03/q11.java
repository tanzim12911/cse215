package ch_03;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        int numOfDays;
        String month_name;

        switch (month) {
            case 1:
                month_name = "January";
                break;
            case 2:
                month_name = "February";
                break;
            case 3:
                month_name = "March";
                break;
            case 4:
                month_name = "April";
                break;
            case 5:
                month_name = "May";
                break;
            case 6:
                month_name = "June";
                break;
            case 7:
                month_name = "July";
                break;
            case 8:
                month_name = "August";
                break;
            case 9:
                month_name = "September";
                break;
            case 10:
                month_name = "October";
                break;
            case 11:
                month_name = "November";
                break;
            case 12:
                month_name = "December";
                break;
        
            default:
                System.out.println("Invalid month");
                break;
        }

        if (month == 4 || month == 6  || month == 9 || month == 11)
            numOfDays = 31;
        else if (month == 2) {
            if (year % 4 == 0)
                numOfDays = 29;
            else
                numOfDays = 28;
        }
        else
            numOfDays = 30;
        
        System.out.println(month_name + " " + year + " has " + numOfDays + " Days");
        
    
    }
}
