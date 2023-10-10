package ch_13.q6;

public class ComparableCircle extends Circle implements Comparable<Circle> {
    
    ComparableCircle() {
        super();
    }
    ComparableCircle(double radius) {
        super(radius);
    }
    
    public int compareTo(Circle c) {
        return Double.compare(super.getArea(), c.getArea());
    }
    
}
