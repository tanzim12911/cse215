package lab_03;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = sc.nextDouble();

        double area;

        if (side < 0)
            System.out.println("The area can not be computed due to invalid side length");
        else {
            area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
            System.out.println("The area of the hexagon is " + area);
        }
    }
}
