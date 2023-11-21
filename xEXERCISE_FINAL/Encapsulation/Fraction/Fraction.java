package xEXERCISE_FINAL.Encapsulation.Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction(){

    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void add(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;

        int n2 = fraction.numerator;
        int m2 = fraction.denominator;

        fraction.numerator = n1 * m2 + n2 * m1;
        fraction.denominator = m1 * m2;
    }
    public void sub(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;

        int n2 = fraction.numerator;
        int m2 = fraction.denominator;

        fraction.numerator = n1 * m2 - n2 * m1;
        fraction.denominator = m1 * m2;
    }
    public void multiplication(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;

        int n2 = fraction.numerator;
        int m2 = fraction.denominator;

        fraction.numerator = n1 * n2;
        fraction.denominator = m1 * m2;
    }
    public void division(Fraction fraction) {
        int n1 = this.numerator;
        int m1 = this.denominator;

        int n2 = fraction.numerator;
        int m2 = fraction.denominator;

        fraction.numerator = n1 * m2;
        fraction.denominator = m1 * n2;
    }
    
    
}
