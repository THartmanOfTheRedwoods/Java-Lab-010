import java.util.*;

public class Date {
    private int year;
    private int month;
    private int day;

    //constructor with no parameters
    public Date() {
        this.year = 1970; // default year
        this.month = 1;   // default month
        this.day = 1;     // default day
    }

    // Second constructor with parameters
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    //  Date object with birthdate
    public static void main(String[] args) {
        Date birthday = new Date(1990, 5, 20);
        System.out.println("Birthday: " + birthday);

        // Test Rational class
        Rational rationalNumber = new Rational(3, 5);
        rationalNumber.printRational();
        System.out.println("Double value: " + rationalNumber.toDouble());
        rationalNumber.negate();
        rationalNumber.printRational();
        rationalNumber.invert();
        rationalNumber.printRational();

        Rational rationalNumber2 = new Rational(2, 3);
        Rational result = rationalNumber.add(rationalNumber2);
        result.printRational();
    }
}

class Rational {
    private int numerator;
    private int denominator;

    // Constructor with no arguments
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor with two arguments
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Method to display Rational object
    public void printRational() {
        System.out.println(this);
    }

    // Override toString method
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Method to negate the rational number
    public void negate() {
        this.numerator = -this.numerator;
    }

    // Method to invert the rational number
    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    // Method to convert rational number to double
    public double toDouble() {
        return (double)this.numerator / this.denominator;
    }

    // Method to reduce rational number to lowest terms
    public Rational reduce() {
        int gcd = findGCD(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    // Method to find greatest common divisor (GCD) using Euclidean algorithm
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    // Method to add rational numbers
    public Rational add(Rational other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        Rational result = new Rational(num, denom);
        return result.reduce();
    }
}