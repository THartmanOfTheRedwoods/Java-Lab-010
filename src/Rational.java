public class Rational {
    private int numerator;
    private int denominator;

    // Constructor with no arguments, sets numerator to 0 and denominator to 1
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor with two arguments to set numerator and denominator
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Instance method to print the Rational object in a sensible format
    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    // toString method to represent Rational as a string
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    // Negate method to reverse the sign of a rational number
    public void negate() {
        this.numerator = -this.numerator;
    }

    // Invert method to swap the numerator and denominator
    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    // toDouble method to convert the rational number to a double
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    // reduce method to reduce a rational number to its lowest terms
    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    // Helper method to find the greatest common divisor (GCD) using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Main method to test the Rational class
    public static void main(String[] args) {
        Rational myRational = new Rational(3, 4);
        System.out.println("My Rational number: " + myRational);

        // Testing negate method
        myRational.negate();
        System.out.println("Negated Rational: " + myRational);

        // Testing invert method
        myRational.invert();
        System.out.println("Inverted Rational: " + myRational);

        // Testing toDouble method
        System.out.println("Rational to Double: " + myRational.toDouble());

        // Testing reduce method
        Rational reduced = myRational.reduce();
        System.out.println("Reduced Rational: " + reduced);
    }
}

