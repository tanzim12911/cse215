package ch_13.q12;

public class q12 {
    public static void main(String[] args) {
        GeometricObject[] list = new GeometricObject[4];

        list[0] = new Circle(5);
        list[1] = new Circle(10);
        list[2] = new Rectangle(5, 4);
        list[3] = new Rectangle(10, 8);
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
