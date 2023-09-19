package ch_10.q12;

import ch_10.q4.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyPoint getP1() {
        return p1;
    }
    public MyPoint getP2() {
        return p2;
    }
    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double ab = p1.distance(p2);
        double bc = p2.distance(p3);
        double ca = p3.distance(p1);

        double s = (ab + bc  + ca) / 2;
        
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    public double getPerimeter() {
        double ab = p1.distance(p2);
        double bc = p2.distance(p3);
        double ca = p3.distance(p1);

        return ab + bc + ca;
    }
}
