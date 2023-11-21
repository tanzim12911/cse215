package xEXERCISE_FINAL.Inheritance.Geometry;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = sc.next();

        System.out.println("Is the triangle filled? (true/false)");
        boolean filled = sc.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(filled);

        System.out.println("Area of the traingle: " + t.getArea());
        System.out.println("Perimeter of the traingle: " + t.getPerimeter());
        System.out.println("Color of the traingle: " + t.getColor());
        System.out.println("Is the traingle filled? " + t.getFilled());
    }
}
