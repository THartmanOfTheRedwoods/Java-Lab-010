public class Rational {
    private int numerator;
    private int denominator;

    // Constructor with no arguments
    public Rational() {
        this(0, 1);
    }

    // Constructor with two arguments
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Print rational number
    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    // toString method
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Simplify rational number
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Compute greatest common divisor
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Negate rational number
    public void negate() {
        numerator = -numerator;
    }

    // Invert rational number
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // Convert rational number to double
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Reduce rational number to lowest terms
    public Rational reduce() {
        int gcd = gcd(numerator, denominator);
        return new Rational(numerator / gcd, denominator / gcd);
    }

    // Add two rational numbers
    public Rational add(Rational other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator).reduce();
    }

    public static void main(String[] args) {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);

        // print original rational numbers
        System.out.println("Rational 1: ");
        rational1.printRational();
        System.out.println("Rational 2: ");
        rational2.printRational();

        // negate rational1
        rational1.negate();
        System.out.println("Negated rational 1: ");
        rational1.printRational();

        // invert rational1 and rational2
        rational1.invert();
        rational2.invert();
        System.out.println("Inverted rational 1: ");
        rational1.printRational();
        System.out.println("Inverted rational 2: ");
        rational2.printRational();

        // add negated rational1 and inverted rational2
        Rational sum = rational1.add(rational2);
        System.out.println("Sum of negated rational 1 and inverted rational 2: ");
        sum.printRational();
        System.out.println("Sum as a double: " + sum.toDouble());}}