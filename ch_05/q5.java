package ch_05;

public class q5 {
    public static void main(String[] args) {
        System.out.println("Kilograms Pounds | Pounds Kilograms");
        for (int i = 1, j = 25; i <= 199; i += 2, j += 5) 
        {
            double calcPound = i * 2.2;
            double calcKilo = j / 2.2;
            
            System.out.print(i + "          ");
            System.out.printf(" %.1f", calcPound);
            System.out.print(" | " + j + " ");
            System.err.printf(" %.2f\n", calcKilo);
        }
    }
}
