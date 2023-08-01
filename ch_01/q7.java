package ch_01;

public class q7 {
    public static void main(String[] args) {
        double approx_1, approx_2;

        approx_1 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        approx_2 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println(approx_1);
        System.out.println(approx_2);
    }
}
