package lab07.Task2;

public class TestClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        f1.sub(f2);
        System.out.println(f2.toString());

        f1.add(f2);
        System.out.println(f2.toString());

        

        f1.multiplication(f2);
        System.out.println(f2.toString());

        f1.division(f2);
        System.out.println(f2.toString());
    }

    
}