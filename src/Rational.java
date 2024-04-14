import static com.sun.tools.javac.jvm.Code.negate;

public class Rational {
    int numerator, denominator;
    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
    }
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static void printRational(Rational rational) {
        System.out.println(rational.numerator + "/" + rational.denominator);
    }
    public static void invert(Rational rational) {
        int oldNumerator = rational.numerator;
        int oldDenominator = rational.denominator;
        rational.numerator = oldDenominator;
        rational.denominator = oldNumerator;
    }
    public static double toDouble(Rational rational) {
        double numerator = rational.numerator;
        double denominator = rational.denominator;
        return numerator / denominator;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        return gcd(b, r);
    }
    public static void reduce(Rational rational) {
        int gcd = gcd(rational.numerator, rational.denominator);
        rational.numerator = rational.numerator / gcd;
        rational.denominator = rational.denominator / gcd;
    }
    public static Rational add(Rational rational1, Rational rational2) {
        int newNumerator = rational1.numerator * rational2.denominator + rational1.denominator * rational2.numerator;
        Rational newRational = new Rational(newNumerator, newDenominator);
        reduce(newRational);
        return newRational;
    }
    public static void main(String[] args) {
        Rational rational1 = new Rational();
        rational1.numerator = -2;
        rational1.denominator = 3;
        printRational(rational1);

        Rational rational2 = new Rational(4,5);
        printRational(rational2);

        negate(rational1);
        printRational(rational1);

        invert(rational1);
        printRational(rational1);

        double decimal = toDouble(rational1);
        System.out.println(decimal);

        Rational rational3 = new Rational(7,21);
        printRational(rational3);
        reduce(rational3);
        printRational(rational3);

        printRational(add(rational2, rational3));
    }}
