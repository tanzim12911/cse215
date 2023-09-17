package ch_11.q1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter three sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        Triangle t1 = new Triangle(side1, side2, side3);

        System.out.print("Enter color of the triangle: ");
        String color = sc.next();
        t1.setColor(color);

        System.out.print("Enter boolean value of filled: ");
        t1.setFilled(sc.nextBoolean());

        System.out.println("Area of the triangle: " + t1.getArea());
        System.out.println("Perimeter of the triangle: " + t1.getPerimeter());
        System.out.println("Color of the traingle is " + t1.getColor());
        System.out.println("Is triangle fillerd: " + t1.isFilled());
        System.out.println(t1.toString());
    }
}
