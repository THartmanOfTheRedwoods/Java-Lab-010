// Written By: Austin Barnett
// Date: 4/10/2024
// Version 1.0
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public void negate() {
        this.numerator = -this.numerator;
    }

    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    public Rational add(Rational r) {
        int numerator = this.numerator * r.denominator + this.denominator * r.numerator;
        int denominator = this.denominator * r.denominator;
        Rational result = new Rational(numerator, denominator);
        result.reduce();
        return result;
    }

    public void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Rational r = new Rational(2, 3);
        r.printRational();
        r.negate();
        r.printRational();
        r.invert();
        r.printRational();
        System.out.println(r.toDouble());
    }
}
