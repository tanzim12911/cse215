package ch_05;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Kilograms Pounds  |  Pounds Kilograms");
        for (int i = 1, j = 20; i <= 10; i ++, j += 5) 
        {
            double calcKM = i * 1.609;
            double calcML = j / 1.609;
            
            System.out.print(i + "           ");
            System.out.printf(" %.1f", calcKM);
            System.out.print(" |    " + j + "    ");
            System.err.printf(" %.2f\n", calcML);
        }
    }
}
