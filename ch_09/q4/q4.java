package ch_09.q4;

import java.util.Random;

public class q4 {
    public static void main(String[] args) {
        Random ran1 = new Random(1000);
        for (int i = 0; i < 50; i++) {
        System.out.print(ran1.nextInt(100) + " ");
        }
    }
    
}
