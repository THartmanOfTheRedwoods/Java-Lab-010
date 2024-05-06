public class Rational {

    private int numerator;
    private int denominator;

    public void Rational(){
        this.numerator =  0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void negate(){
        numerator = -numerator;
    }

    public void printRational(){
        System.out.println(numerator + "/" + denominator);
    }

    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public void invert(){
        numerator = -numerator;
        if (numerator != 0) {
            int newDenominator = numerator;
            numerator = denominator;
            denominator = newDenominator;
        }

    }

    public double toDouble() {
        if (numerator != 0) {
            int oringinalNumerator = denominator;
            denominator = numerator;
            numerator = oringinalNumerator;
        }
        return (double) numerator / denominator;
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }


    public Rational reduce() {

        int gcd = gcd(numerator, denominator);
        return new Rational(numerator / gcd, denominator / gcd);

    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        return new Rational(newNumerator, newDenominator).reduce();
    }

    public static void main(String[] args){
        Rational myRational = new Rational (6,8);

        //System.out.println(myRational.numerator + "/" + myRational.denominator);

        myRational.printRational();
        System.out.println("My Rational Number: " + myRational);

        myRational.negate();

        System.out.println("My Rational Number but Negated: " + myRational);

        myRational.invert();

        System.out.println("My Rational Number but Inverted: " + myRational);

        double doubleMyRational = myRational.toDouble();

        System.out.println("My Rational Number but as a Double: " + doubleMyRational);


        System.out.println("My Rational Number but Reduced: " + myRational.reduce());

        Rational addedToMyRational = new Rational(8,10);
        Rational sum = myRational.add(addedToMyRational);

        System.out.println("My Rational Number but added to " + addedToMyRational.numerator + "/" + addedToMyRational.denominator + ": " + sum);

    }
}
