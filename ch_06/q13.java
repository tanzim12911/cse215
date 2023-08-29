package ch_06;

public class q13 {
    public static void main(String[] args) {
        System.out.println("i               m(i)");
        System.out.println("____________________");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "               " + sumSeries(i));
        }
    }
    
    public static double sumSeries(int i) {
        return i / (i + 1);
    }
}

