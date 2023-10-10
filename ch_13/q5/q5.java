package ch_13.q5;

public class q5 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(5, 1);

        System.out.println("The larger of the two circles is the one: " + Circle.max(c1, c2));
        
        System.out.println("The larger of the two rectangles is the one: " + Rectangle.max(r1, r2));
    }
}
