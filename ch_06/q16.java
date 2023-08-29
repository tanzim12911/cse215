package ch_06;

public class q16 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int days = 365;

        if (year % 4 == 0 || year % 400 == 0)
            days = 366;

        return days;
    }
}
