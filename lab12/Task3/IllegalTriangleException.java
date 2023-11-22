package lab12.Task3;

public class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;

    IllegalTriangleException(String s) {
        super(s);
    }
    IllegalTriangleException(double side1, double side2, double side3) {
        super("The sum of any two sides is not greater than the third side");
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
