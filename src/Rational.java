class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public String toString() {
        String s = numerator + "/" + denominator;
        return s;
    }

    public void negate() {
        numerator = -numerator;
    }

    public void invert() {
        if (numerator == 0) {
            throw new ArithmeticException("Inverting is impossible because denominator is 0");
        }
        int imp = numerator;
        numerator = denominator;
        denominator = imp;
    }

    public double toDouble() {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }

    public Rational reduce() {
        if (numerator == 0) {
            throw new IllegalArgumentException("Cannot reduce a rational number with a zero numerator");
        }
        int a = numerator;
        int b = denominator;
        while (b != 0) {
            int hold = b;
            b = a % b;
            a = hold;
        }
        int gcd = a;
        int redNumerator = numerator / gcd;
        int redDenominator = denominator / gcd;
        return new Rational(redNumerator, redDenominator);
    }

    public Rational add(Rational diff) {
        if (denominator == 0 || diff.denominator == 0) {
            throw new ArithmeticException("Cannot add rational numbers with zero denominators");
        }
        int newDenominator = this.denominator * diff.denominator;
        int newNumerator = (this.numerator * diff.denominator) + (diff.numerator * this.denominator);
        return new Rational(newNumerator, newDenominator).reduce();
    }
}
