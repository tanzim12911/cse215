package xEXERCISE_QUIZ.ExceptionHandling;

public class Circle {
    private double radius;
    private static int numOfCircle = 0;
    
    public Circle() {
        this.radius = 1;
        numOfCircle++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numOfCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumOfCircle() {
        return numOfCircle;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

    



    
}
