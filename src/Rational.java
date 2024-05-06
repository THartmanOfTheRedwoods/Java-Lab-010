public class Rational {

    // Instance variables
    private int numerator;
    private int denominator;

    // Default constructor
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor to initialize instance variables
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        this.numerator = numerator;
        this.denominator = denominator;

        // Reduce to lowest terms upon creation
        reduce();
    }

    // Static method to calculate the greatest common divisor (GCD) of two integers
    private static int greatestCommonDivisor(int a, int b) {
        // Euclidean algorithm for GCD calculation
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Instance method to convert to a string representation
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Instance method to negate the rational number (reverse sign)
    public void negate() {
        numerator = -numerator;
    }

    // Instance method to invert the rational number (swap numerator and denominator)
    public void invert() {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot invert rational with zero denominator");
        }
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // Instance method to convert to a double
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Instance method to reduce a rational number to its lowest terms
    public void reduce() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Instance method to add two rational numbers (returns a new Rational object)
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        // Create a new Rational object with the calculated values
        Rational result = new Rational(newNumerator, newDenominator);
        // Reduce the result and return the complete Rational object
        result.reduce();
        return result;
    }

    // Main method to demonstrate functionalities
    public static void main(String[] args) {

        // Test constructors and reduce
        System.out.println("Creating rational number 1/2:");
        Rational rational1 = new Rational(1, 2);
        System.out.println(rational1); // Print using toString

        System.out.println("Creating rational number 3 with default denominator:");
        Rational rational2 = new Rational();
        System.out.println(rational2);

        // Test negate
        System.out.println("Negating rational1:");
        rational1.negate();
        System.out.println(rational1);

        // Test invert with validation
        System.out.println("Inverting rational2:");
        try {
            rational2.invert();
            System.out.println(rational2);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot invert rational with zero denominator");
        }

        // Test add
        System.out.println("Adding rational1 and rational2:");
        Rational sum = rational1.add(rational2);
        System.out.println(sum);

        // Test toDouble
        System.out.println("Converting rational1 to double:");
        System.out.println(rational1.toDouble());
    }
}
