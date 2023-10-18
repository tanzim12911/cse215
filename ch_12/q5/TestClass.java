package ch_12.q5;

public class TestClass {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Triangle t = new Triangle(2, 2, 4);
            System.out.println(t.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

