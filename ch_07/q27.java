package ch_07;

public class q27 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i) && isPrime(reverse(i))) {
                System.out.print(i + " ");
                count++;
            }

            if (count == 10) {
                System.out.println();
                count = 0;
            }
                 
        }
    }

    static boolean isPrime(int x) {
        boolean status = false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                status = false;
            else
                status = true;
        }
        return status;
    }

    static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x /= 10;
        }

        return reverse;
    }
}
