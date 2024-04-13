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
            System.err.println("Can't divide by zero.");
            System.exit(0);
        }
    }

    public String printRational() {
        return this.numerator + "/" + this.denominator;
    }

    public String toString() {
        return printRational();
    }

    public void negate() {
        this.numerator = -this.numerator;
    }

    public void invert() {
        int numeratorHolder = this.numerator;
        this.numerator = this.denominator;
        this.denominator = numeratorHolder;
    }

    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Rational add(Rational add) {
        int newNumerator = this.numerator * add.denominator + add.numerator * this.denominator;
        int newDenominator = this.denominator * add.denominator;
        return new Rational(newNumerator, newDenominator).reduce();
    }

    public static void main(String[] args) {
        Rational rational0 = new Rational(7,4);
        rational0.printRational();
        System.out.println(rational0);

        rational0.negate();
        System.out.println(rational0);

        Rational rational1 = new Rational(2,3);
        rational1.invert();
        System.out.println(rational1);

        Rational rational2 = new Rational(7,4);
        System.out.println(rational2.toDouble());

        Rational rational3 = new Rational(10,16);
        System.out.println(rational3.reduce());

        Rational rational4 = new Rational(1, 3);
        Rational sum = rational2.add(rational4);
        System.out.println(sum.toString());
    }
}
