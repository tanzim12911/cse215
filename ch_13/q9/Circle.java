package ch_13.q9;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + getRadius() + "\nArea: "
                + getArea() + "\nPerimeter: " + getPerimeter();
    }

    @Override
    public boolean equals(Object o) {
        Circle c = (Circle) o;
        if(this.radius == c.radius)
            return true;
        else
            return false;
    }

    @Override
    public int compareTo(Circle c) {
        return Double.compare(radius, c.radius);
    }
}
