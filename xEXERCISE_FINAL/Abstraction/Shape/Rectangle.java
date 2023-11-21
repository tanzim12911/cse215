package xEXERCISE_FINAL.Abstraction.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;
    
    Rectangle() {

    }
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
    
}
