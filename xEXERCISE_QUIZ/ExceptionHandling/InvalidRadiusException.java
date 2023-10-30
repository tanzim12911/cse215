package xEXERCISE_QUIZ.ExceptionHandling;

public class InvalidRadiusException extends Exception {
    private double radius;

    InvalidRadiusException(String message) {
        super(message);
    } 
    InvalidRadiusException(double radius) {
        super("Invalid radius: " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
