

public class test {
    public static void main(String[] args) {
        System.out.println("i               m(i)");
        System.out.println("____________________");
        for (int i = 1; i <= 901; i += 100) {
            System.out.println(i + "               " + estimatePI(i));
        }
    }
    
    public static double estimatePI(int n) {
        double m = 0;
        for (int i = 1; i <= n; i++) {
            m += Math.pow(-1, i + 1) / (2.0 * i - 1);
        }
        return m;
    }
}
