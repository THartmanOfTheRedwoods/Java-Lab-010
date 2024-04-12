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

    public String toString() {
        return this.numerator + "/" + this.denominator;
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

    public Rational reduce() {
        int gcd = findGCD(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator).reduce();
    }

    public static void main(String[] args) {

        Rational defaultRational = new Rational();
        System.out.println("Default Rational: ");
        defaultRational.printRational();

        Rational rational = new Rational(3, 4);
        System.out.println("Rational: ");
        rational.printRational();

        System.out.println("toString: " + rational.toString());

        rational.negate();
        System.out.println("Negate: ");
        rational.printRational();

        rational.invert();
        System.out.println("Invert: ");
        rational.printRational();

        System.out.println("To Double: " + rational.toDouble());

        Rational reducedRational = new Rational(4, 6);
        System.out.println("Reduced Rational: ");
        reducedRational.printRational();
        System.out.println("After Reduction: ");
        reducedRational.reduce().printRational();

        Rational otherRational = new Rational(1, 2);
        System.out.println("Addition: ");
        rational.add(otherRational).printRational();
    }
}
