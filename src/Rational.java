public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
    }

    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    /* Used toString for Date.java instead
    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
    */

    public void negate() {
        numerator = -numerator;
    }

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Rational reduce() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        return new Rational(numerator / gcd, denominator / gcd);
    }

    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public Rational add(Rational other) {
        int resultNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int resultDenominator = this.denominator * other.denominator;
        return new Rational(resultNumerator, resultDenominator).reduce();
    }

    public static void main(String[] args) {
        Rational rational1 = new Rational(9, 12);
        Rational rational2 = new Rational(1, 2);

        System.out.println("Rational 1: ");
        rational1.printRational();
        System.out.println("Rational 2: ");
        rational2.printRational();

        rational1.negate();
        System.out.println("Negated Rational 1: ");
        rational1.printRational();

        rational2.invert();
        System.out.println("Inverted Rational 2: ");
        rational2.printRational();

        System.out.println("Rational 1 as double: " + rational1.toDouble());

        Rational reducedRational1 = rational1.reduce();
        System.out.println("Reduced Rational 1: ");
        reducedRational1.printRational();

        Rational sum = rational1.add(rational2);
        System.out.println("Sum of Rational 1 and Rational 2: ");
        sum.printRational();
    }
}