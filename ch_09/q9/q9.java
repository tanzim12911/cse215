package ch_09.q9;

public class q9 {
    public static void main(String[] args) {
        RegularPolygon p_1 = new RegularPolygon();
        RegularPolygon p_2 = new RegularPolygon(6, 4);
        RegularPolygon p_3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The perimeter of polygon 1: " + p_1.getPerimeter());
        System.out.println("The area of polygon 1: " + p_1.getArea());

        System.out.println("The perimeter of polygon 2: " + p_2.getPerimeter());
        System.out.println("The area of polygon 2: " + p_2.getArea());

        System.out.println("The perimeter of polygon 3: " + p_3.getPerimeter());
        System.out.println("The area of polygon 3: " + p_3.getArea());
    }
}
