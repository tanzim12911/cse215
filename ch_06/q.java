package ch_06;

public class q {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 1;
            }
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
