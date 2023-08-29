package ch_09.q10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double n1, double n2, double n3) {
        a = n1;
        b = n2;
        c = n3;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b - (4 * a * c));
    }

    public double getRoot1() {
        if(getDiscriminant() < 0)
            return 0;
        else
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if(getDiscriminant() < 0)
            return 0;
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
