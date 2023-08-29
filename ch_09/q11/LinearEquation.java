package ch_09.q11;

public class LinearEquation {
    private double a, b, c, d, e, f;

    LinearEquation (double x1, double x2, double x3, double x4, double x5, double x6) {
        a = x1;
        b = x2;
        c = x3;
        d = x4;
        e = x5;
        f = x6;
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
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        boolean status = false;
        if ((a * d) - (b * c) == 0)
            status = true;

        return status;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
