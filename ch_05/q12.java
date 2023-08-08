package ch_05;

public class q12 {
    public static void main(String[] args) {
        int n = 100;
        while (n * n < 12000) {
            n++;
        }

        System.out.println("Smallest value of n: " + n);
    }
}
