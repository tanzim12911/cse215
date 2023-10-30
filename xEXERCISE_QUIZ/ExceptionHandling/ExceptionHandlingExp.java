package xEXERCISE_QUIZ.ExceptionHandling;

public class ExceptionHandlingExp {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(4, 5, 2);
        }
        catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
