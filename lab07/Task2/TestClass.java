package lab07.Task2;

public class TestClass {
    public static void main(String[] args) {
        int n1 = 1;
        int m1 = 4;
        int n2 = 3;
        int m2 = 5;


        Fraction f1 = new Fraction(n1, m1);
        Fraction f2 = new Fraction(n2, m2);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        f1.add(f2);
        System.out.println(f1.toString());

        f1.setNumerator(n1);
        f1.setDenominator(m1);

        f1.sub(f2);
        System.out.println(f1.toString());

        f1.setNumerator(n1);
        f1.setDenominator(m1);

        f1.multiplication(f2);
        System.out.println(f1.toString());

        f1.setNumerator(n1);
        f1.setDenominator(m1);

        f1.division(f2);
        System.out.println(f1.toString());
    }

    
}
