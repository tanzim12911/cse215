package ch_13.q1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t1 = new Triangle();

        System.out.println("Enter 3 sides of the triangle: ");
        t1.setSide1(sc.nextDouble());
        t1.setSide2(sc.nextDouble());
        t1.setSide3(sc.nextDouble());
        
        System.out.println("Enter traingle color: ");
        t1.setColor(sc.next());

        System.out.println(:"Is the triangle filled?");
        t1.setFilled(sc.nextBoolean());
    }
}
