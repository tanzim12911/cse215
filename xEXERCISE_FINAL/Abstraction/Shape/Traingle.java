package xEXERCISE_FINAL.Abstraction.Shape;

public class Traingle extends Shape {
    private int base;
    private int height;

    Traingle() {

    }

    Traingle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Traingle [base=" + base + ", height=" + height + "]";
    }

    
    
}
