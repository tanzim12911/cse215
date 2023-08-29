package ch_09.q1;

public class q1 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.5);

        System.out.println("Width R1: " + rec1.width);
        System.out.println("Height R1: " + rec1.height);
        System.out.println("Area R1: " + rec1.getArea());
        System.out.println("Perimeter R1: " + rec1.getPerimeter());

        System.out.println("Width R2: " + rec2.width);
        System.out.println("Height R2: " + rec2.height);
        System.out.println("Area R2: " + rec2.getArea());
        System.out.println("Perimeter R2: " + rec2.getPerimeter());
    }
}
