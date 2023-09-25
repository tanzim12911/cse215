package assignment_02.q3;

public class q3 {
    public static void main(String[] args) {
        RegularPolygon ob1 = new RegularPolygon();
        RegularPolygon ob2 = new RegularPolygon(10, 6);
        RegularPolygon ob3 = new RegularPolygon(6, 4, 5.6, 7.8);

        System.out.println("  Regular Polygon Objects  |  Perimeter  |  Area");
        System.out.println("__________________________________________________");
        System.out.println("        Object# 1          |     "+ ob1.getPerimeter() +"      |   " + ob1.getArea());
        System.out.println("        Object# 2          |     "+ ob2.getPerimeter() +"      |   " + ob2.getArea());
        System.out.println("        Object# 3          |     "+ ob3.getPerimeter() +"      |   " + ob3.getArea());
    }
}
