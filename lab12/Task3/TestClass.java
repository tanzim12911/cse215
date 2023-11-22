package lab12.Task3;

public class TestClass {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(1.0, 0.1, 0.2);
            System.out.println("Area: " + t.getArea());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Triangle t = new Triangle(1.0, 1.0, 1.0);
            System.out.println("Area: " + t.getArea());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
