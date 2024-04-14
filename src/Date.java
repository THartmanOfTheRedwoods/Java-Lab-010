public class Date {

    int year;
    int month;
    int day;

    public Date() {
        this.year = 2024;
        this.month = 4;
        this.day = 13;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void printDate() {
        System.out.println("Birthday: " + getYear() + "-" + getMonth() + "-" + getDay());
    }

    public static void main(String[] args) {
        Date birthday = new Date(2003, 8, 22);
        birthday.printDate();
    }
    class Rational {
        int numerator;
        int denominator;

        public Rational() {
            this.numerator = 0;
            this.denominator = 1;
        }
        public Rational(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        public void printRational() {
            if (denominator == 1) {
                System.out.println(numerator);
            }else{
                System.out.println(numerator + "/" + denominator);
            }
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
            return (double) numerator / denominator;
        }
        private void reduce() {
            int gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        public Rational add(Rational other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            Rational result = new Rational(newNumerator, newDenominator);
            result.reduce();
            return result;
        }
        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public void main(String[] args) {
            Rational rationalNum1 = new Rational(2, 3);
            rationalNum1.printRational();

            rationalNum1.negate();
            System.out.println("Negated rational Number: " + rationalNum1);

            rationalNum1.invert();
            System.out.println("Inverted rational Number: " + rationalNum1);

            System.out.println("Rational number as double: " + rationalNum1.toDouble());

            Rational rationalNum2 = new Rational(3, 4);
            System.out.println("Sum of rational numbers: " + rationalNum1.add(rationalNum2));
        }
    }
}
