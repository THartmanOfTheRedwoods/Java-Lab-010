class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2024;
        this.month = 4;
        this.day = 12;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }
}
class Rational {
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

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public void negate() {
        this.numerator = -this.numerator;
    }

    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }
}
public class Main {
    public static void main(String[] args){
        Date birthday = new Date(1999, 1, 1);
        System.out.println("Birthday: " + birthday.getYear() + "-" + birthday.getMonth() + '-' + birthday.getDay());

        Rational number = new Rational(2, 3);
        number.printRational();
        System.out.println(number.toString());
        number.negate();
        number.printRational();
        number.invert();
        number.printRational();
        System.out.println(number.toDouble());
    }
}