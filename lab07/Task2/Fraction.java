package lab07.Task2;

public class Fraction {
    private int numerator;
    private int denominator;

    // constructors
    Fraction() {
    
    }
    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    // getter methods
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    // setter methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // toString method
    public String toString() {
        return (numerator + " / " + denominator);
    }

    // methods
    public void add(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;
        int n2 = fraction.numerator;
        int m2 = fraction.denominator;
        
        this.numerator = (n1 * m2) + (n2 * m1);
        this.denominator = m1 * m2;
    }

    public void sub(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;
        int n2 = fraction.numerator;
        int m2 = fraction.denominator;
        
        this.numerator = (n1 * m2) - (n2 * m1);
        this.denominator = m1 * m2;
    }

    public void multiplication(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;
        int n2 = fraction.numerator;
        int m2 = fraction.denominator;
        
        this.numerator = n1 * n2;
        this.denominator = m1 * m2;
    }

    public void division(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;
        int n2 = fraction.numerator;
        int m2 = fraction.denominator;
        
        this.numerator = n1 * m2;
        this.denominator = m1 * n2;
    }

}
