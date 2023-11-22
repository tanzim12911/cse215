package lab12.Task3;

public class TestClass {
    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(3, 4, 5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
