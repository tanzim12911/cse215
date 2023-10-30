package xEXERCISE_QUIZ.ExceptionHandling;

public class ExceptionHandlingExp {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(2);
            Circle c3 = new Circle(0);
        }
        catch(InvalidRadiusException e) {
            System.out.println(e.toString());
        }

    }
}
