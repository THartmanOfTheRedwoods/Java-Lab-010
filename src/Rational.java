public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
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
    public void reduce() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }
    public Rational add(Rational other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Rational rationalNumber1 = new Rational(2, 4);
        rationalNumber1.printRational();

        rationalNumber1.negate(); //negate test
        System.out.println("Negated rational number: " + rationalNumber1);

        rationalNumber1.invert(); //invert test
        System.out.println("Inverted rational number: " + rationalNumber1);

        System.out.println("Rational number as double: " + rationalNumber1.toDouble()); //double test

        Rational rationalNumber2 = new Rational(1, 5); //addition test
        System.out.println("Sum of rational numbers: " + rationalNumber1.add(rationalNumber2));
    }
}