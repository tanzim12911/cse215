package ch_07;

public class q27 {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;
        int i = 12;
            
        do {
            if (isPrime(i) && isPrime(reverse(i))) {
                System.out.print(i + " ");
                count++;
                x++;
            }

            if (x == 10) {
                System.out.println();
                x = 0;
            }

            i++;
        } (count <= 100);
        
    }

    static boolean isPrime(int x) {
        boolean status = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                status = false;
                break;
            }
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
