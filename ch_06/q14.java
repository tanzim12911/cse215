package ch_06;

public class q14 {
    public static void main(String[] args) {
        System.out.println("i               m(i)");
        System.out.println("____________________");
        for (int i = 1; i <= 901; i += 100) {
            System.out.println(i + "               " + estimatePI(i));
        }
    }
    
    public static double estimatePI(int i) {
        double m = (double) Math.pow(-1, i + 1) / (2 * i - 1);
        return 4 * m;
    }
}
