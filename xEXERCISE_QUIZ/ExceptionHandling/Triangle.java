package xEXERCISE_QUIZ.ExceptionHandling;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if ((side1 + side2) < side3 || (side2 + side3) < side1 || (side1 + side3) < side2) {
            throw new IllegalTriangleException("The sum of any two sides of a triangle must be greater than the other side");
        }
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return 0.5 * side1 * side2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
        " side3 = " + side3;
    }
}

