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
        System.out.println(numerator + "/" + denominator);
    }

    @Override
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


    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public Rational reduce() {
        int gcdValue = gcd(numerator, denominator);
        return new Rational(numerator / gcdValue, denominator / gcdValue);
    }


    public Rational add(Rational other) {
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int newDenominator = denominator * other.denominator;
        Rational result = new Rational(newNumerator, newDenominator);
        return result.reduce();
    }


    public static void main(String[] args) {
        Rational rational = new Rational(3, 4);
        rational.printRational();
        System.out.println(rational);
        rational.negate();
        System.out.println("Negate: " + rational);
        rational.invert();
        System.out.println("Invert: " + rational);
        double doubleValue = rational.toDouble();
        System.out.println("As double: " + doubleValue);
        Rational other = new Rational(1, 2);
        Rational sum = rational.add(other);
        System.out.println("Sum: " + sum);
    }
}