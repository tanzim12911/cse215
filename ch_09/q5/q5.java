package ch_09.q5;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class q5 {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Current day: " + gcal.getTime());
        int year = gcal.get(Calendar.YEAR);
        int month = gcal.get(Calendar.MONTH);
        int day = gcal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " " + month + " " + day);
    }

    
}
