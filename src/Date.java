import java.util.Objects;

// Class definition for Date
class Date {
    // Instance variables
    private int year;
    private int month;
    private int day;

    // Constructors
    public Date() {
        this.year = 1970;
        this.month = 1;
        this.day = 1;
    }

    // Parameters
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Main method
    public static void main(String[] args) {
        // Creating a Date object for birthday
        Date birthday = new Date(1990, 5, 15);
        System.out.println("My birthday is: " + birthday);
    }

    // tostring method
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}

// Class definition for rational
class Rational {
    // Instance variables
    private int numerator;
    private int denominator;

    // Constructor with no arguments
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor with two arguments
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Instance method to print Rational object
    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    // Instance method to negate the rational number
    public void negate() {
        this.numerator = -this.numerator;
    }

    // Instance method to invert the rational number
    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    // Instance method to convert rational number to double
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Instance method to reduce the rational number to lowest terms
    public Rational reduce() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        return new Rational(numerator / gcd, denominator / gcd);
    }

    // Static method to find greatest common divisor (GCD) using Euclidean algorithm
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Instance method to add rational numbers
    public Rational add(Rational other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Rational(num, den).reduce();
    }

    // Override equals method for Rational objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rational rational = (Rational) obj;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    // Override hashCode method for Rational objects
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a Rational object
        Rational rationalNumber = new Rational(3, 4);
        // Printing the rational number
        rationalNumber.printRational();
        // Negating the rational number
        rationalNumber.negate();
        rationalNumber.printRational();
        // Inverting the rational number
        rationalNumber.invert();
        rationalNumber.printRational();
        // Converting the rational number to double
        System.out.println("Double value: " + rationalNumber.toDouble());
        // Reducing the rational number to lowest terms
        Rational reduced = rationalNumber.reduce();
        System.out.print("Reduced form: ");
        reduced.printRational();
        // Testing addition of rational numbers
        Rational anotherNumber = new Rational(1, 2);
        Rational sum = rationalNumber.add(anotherNumber);
        System.out.print("Sum: ");
        sum.printRational();
    }
}
