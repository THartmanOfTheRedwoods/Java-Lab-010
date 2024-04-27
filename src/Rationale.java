/**
 * @author Alexei Iachkov
 * @date 4-13-2024
 * @version 1.0
 */

public class Rationale {
    private int numerator;
    private int denominator;

    // Constructor to create a Rational object with numerator 0 and denominator 1
    public Rationale() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor to create a Rational object with given numerator and denominator
    public Rationale(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to reduce the rational number to its simplest form
    public Rationale reduce() {
        int a = this.numerator;
        int b = this.denominator;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        return new Rationale(this.numerator / gcd, this.denominator / gcd);
    }

    // Method to negate the rational number
    public void negate() {
        this.numerator = -this.numerator;
    }

    // Method to invert the rational number
    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    // Method to convert the rational number to a double
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    // Method to add another rational number to this rational number and return a new reduced rational number
    public Rationale add(Rationale other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        int a = newNumerator;
        int b = newDenominator;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        newNumerator /= gcd;
        newDenominator /= gcd;

        return new Rationale(newNumerator, newDenominator);
    }

    // Override toString method to provide custom string representation
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    // Main method to test the Rationale class methods
    public static void main(String[] args) {
        Rationale myRational = new Rationale(1, 2);

        System.out.println("Original Rational: " + myRational);

        System.out.println("Reduced Rational: " + myRational.reduce());

        myRational.negate();
        System.out.println("Negated Rational: " + myRational);

        myRational.invert();
        System.out.println("Inverted Rational: " + myRational);

        System.out.println("Rational as Double: " + myRational.toDouble());

        Rationale anotherRational = new Rationale(3, 4);
        System.out.println("Adding Rationals: " + myRational.add(anotherRational));
    }
}