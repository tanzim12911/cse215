package xEXERCISE_FINAL.Abstraction.Shape;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
}
