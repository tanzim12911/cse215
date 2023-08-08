package ch_05;

public class q5 {
    public static void main(String[] args) {
        System.out.println("Kilograms        Pounds   |   Pounds      Kilograms");
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%d        %.1f\n", i, (i * 2.2));
        }
        for (int i = 20; i <= 515; i += 5 ) {
            System.out.printf("%d        %.1f\n", i, (i / 2.2));
        }
    }
}
