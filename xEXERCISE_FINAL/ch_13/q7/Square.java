package xEXERCISE_FINAL.ch_13.q7;

public class Square extends GeometricObject implements Colorable {
    private double side;

    Square() {

    }
    Square(double side) {
        this.side = side;
    }
    Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    
}
