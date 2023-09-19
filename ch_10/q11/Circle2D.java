package ch_10.q11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        double h = this.x;
        double k = this.y;

        double distance = Math.sqrt(Math.pow(x - h, 2) + Math.pow(y - k, 2));

        if (distance < this.radius) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(Circle2D circle) {
        double diffInRadii = this.radius - circle.getRadius();
        double x1 = circle.getX();
        double y1 = circle.getY();
        double distanceCentre = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));

        if(distanceCentre < diffInRadii) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean overlaps(Circle2D circle) {
        double sumOfRadii = this.radius + circle.getRadius();
        double x1 = circle.getX();
        double y1 = circle.getY();
        double distanceCentre = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));

        if(distanceCentre > sumOfRadii) {
            return true;
        }
        else {
            return false;
        }
    }
}
