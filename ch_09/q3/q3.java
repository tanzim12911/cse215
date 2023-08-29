package ch_09.q3;

import java.util.Date;

public class q3 {
    public static void main(String[] args) {
        
        for (long i = 10000; i <= 100000000000L; i *= 10) {
            Date date1 = new Date(i);
            System.out.println("Elasped time since " + i + " miliseconds is " + date1.toString());
        }
    }
}
