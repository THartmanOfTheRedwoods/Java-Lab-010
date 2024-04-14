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
        int temporary = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temporary;
    }

    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    private int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    public Rational add(Rational r) {
        int newNumerator = (this.numerator * r.denominator) + (r.numerator * this.denominator);
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator).reduce();
    }

    public static void main(String[] args) {
        Rational test = new Rational(2,3);
        test.printRational();
        String testString = test.toString();
        System.out.println(testString);
        test.negate();
        test.printRational();
        test.invert();
        test.printRational();
        System.out.println(test.toDouble());
        System.out.println(test.reduce());
        Rational test2 = new Rational(7,5);
        System.out.println(test.add(test2));

    }
}
