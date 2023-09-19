package ch_10.q13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double height;
    private double width;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    MyRectangle2D() {
        x = 0;
        y = 0;
        height = 1;
        width = 1;
    }

    MyRectangle2D(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return x * y;
    }

    public double getPerimeter() {
        return 2 * (x + y);
    }

    
}
