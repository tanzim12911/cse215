package xEXERCISE_FINAL.Encapsulation.Fraction;

public class TestClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);

        f1.add(f2);
        System.out.println("Addition: " + f2.toString());

        f1.setNumerator(1);
        f1.setDenominator(4);
        f2.setNumerator(3);
        f2.setDenominator(5);

        f1.sub(f2);
        System.out.println("Subtraction: " + f2.toString());

        f1.setNumerator(1);
        f1.setDenominator(4);
        f2.setNumerator(3);
        f2.setDenominator(5);

        f1.multiplication(f2);
        System.out.println("Multiplication: " + f2.toString());

        f1.setNumerator(1);
        f1.setDenominator(4);
        f2.setNumerator(3);
        f2.setDenominator(5);

        f1.division(f2);
        System.out.println("Division: " + f2.toString());
        
    }
    
    
}
