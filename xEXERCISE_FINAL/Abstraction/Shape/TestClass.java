package xEXERCISE_FINAL.Abstraction.Shape;

public class TestClass {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Traingle(10, 5);

        System.out.println(r.getArea());
        System.out.println(r.toString());

        System.out.println(t.getArea());
        System.out.println(t.toString());

    }
}
