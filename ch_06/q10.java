package ch_06;

public class q10 {
    public static void main(String[] args) {
        int n = 10000;
        int count = 0;

        for (int i = 1; i <= 10000; i++) {
            isPrime(i);
            count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
