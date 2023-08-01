package ch_03;
import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight_pck1 = sc.nextDouble();
        double price_pck1 = sc.nextDouble();

        System.out.print("Enter weight and price for package 1: ");
        double weight_pck2 = sc.nextDouble();
        double price_pck2 = sc.nextDouble();

        if ((weight_pck1 / price_pck1) > (weight_pck2 / price_pck2))
            System.out.println("Package 1 has a better price.");
        else if ((weight_pck1 / price_pck1) < (weight_pck2 / price_pck2))
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price");

    }
}
