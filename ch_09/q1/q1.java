package ch_09.q1;

public class q1 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.5);

        System.out.println("Width: " + rec1.width);
        System.out.println("height: " + rec1.height);
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
    }
}
