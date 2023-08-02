package ch_03;

import java.util.Scanner;;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three edges of a traingle");
        double edge_1 = sc.nextDouble();
        double edge_2 = sc.nextDouble();
        double edge_3 = sc.nextDouble();

        if ((edge_1 + edge_2 > edge_3) && (edge_2 + edge_3 > edge_1) && (edge_1 + edge_3 > edge_2))
            System.out.println("Perimerter of the triangle is " + (edge_1 + edge_2 + edge_3));
        else 
            System.out.println("Input is invalid");
    }
}
