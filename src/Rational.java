
//Brendan Fristoe
//CIS-12 Spring

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Error: Cannot devide by Zero.");
        }
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // Method to reverse the sign of (negate) a rational number.
    public void negate(){
        this.numerator *= -1;
    }

    // Method to invert a rational number.
    public void invert(){
        int tempNum = this.numerator;
        this.numerator = this.denominator;
        this.denominator = tempNum;
    }

    // Pure method to covert to a double.
    public double toDouble(){
        return (double) numerator / denominator;
    }

    // Method to reduce a fraction
    public Rational reduce() {
        int gcd = gcd(numerator, denominator); // Calculate GCD.
        return new Rational(numerator / gcd, denominator / gcd); // Create a new rational with reduced terms
    }

    // Helper method to calculate GCD.
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); // Recursive call with remainder as new b
    }

    // Method to calculate least common multiple (LCM)
    private int lcm(int a, int b) {
        return a * (b / gcd(a, b)); // lcm = a * b / gcd(a, b)
    }

    public Rational add(Rational r2) {

        //find LCM of denominators.
        int lcm = lcm(this.denominator, r2.denominator);

        // Calculate new numerators.
        int newNumerator1 = (lcm / this.denominator) * this.numerator;
        int newNumerator2 = (lcm / r2.denominator) * r2.numerator;

        // Add numerators and reduce result.
        Rational sum = new Rational(newNumerator1 + newNumerator2, lcm);
        return sum.reduce();
    }


    // Method to print a formatted string of the rational number.
    public String toString(){
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    public void printRational() {
        if(denominator == 1) {
            System.out.println(numerator);
        }
        else {
            System.out.print(numerator);
            System.out.print("/");
            System.out.println(denominator);
        }
    }

    public static void main(String[] args) {
        Rational newRational = new Rational(5, 8);
        Rational sumRational = new Rational(1, 2);

        newRational.printRational();
        System.out.println(newRational);

        newRational.negate();
        System.out.println("Made negative = " + newRational);

        newRational.negate();
        newRational.invert();
        System.out.println("Flipped = " + newRational);

        double dblRational = newRational.toDouble();
        System.out.println("Decimal value: " + dblRational);

        newRational.invert();
        newRational.reduce();
        System.out.println("Reduced is " + newRational);

        Rational sum = newRational.add(sumRational);
        sum.reduce();
        System.out.println("Sum: " + sum);


    }
}
