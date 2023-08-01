package ch_01;

public class q13 {
    public static void main(String[] args) {
    double x, y, denominator_x, denominator_y, numerator_x, numerator_y;

    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;

    numerator_x = (e * d) - (b * f);
    denominator_x = (a * d) - (b * c);
    x = numerator_x / denominator_x;

    numerator_y = (a * f) - (e * c);
    denominator_y = (a * d) - (b * c);
    y = numerator_y / denominator_y;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    }

}
