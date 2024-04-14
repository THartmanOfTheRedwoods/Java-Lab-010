public class Rational {

    int numerator, denominator;

    public Rational() {
        this.numerator = 2;
        this.denominator = 1;
    }

    public static void printRational(Rational n) {
        System.out.println(n.numerator + "/" + n.denominator);
    }


    public Rational(int a, int b) {
        this.numerator = a;
        this.numerator = b;
    }

    public static void negate(Rational num) {
        num.numerator = num.numerator * -1;
        num.denominator = num.denominator * -1;
    }

    public static void invert(Rational num) {
        int swap1 = num.numerator;
        int swap2 = num.denominator;

        num.numerator = swap1;
        num.denominator = swap2;
    }

    public static double toDouble(Rational num) {
        double w = (double)num.numerator / (double)num.denominator;
        return w;
    }

    public static void reduce(Rational num) {
        int last, num1, num2;
        num1 = num.numerator;
        num2 = num.denominator;
        last = num1 % num2;
        while(last != 0) {
            last = num1 % num2;
            num1 = num2;
            num2 = last;
        }
        int GCD = num1;
        Rational l = new Rational(num.numerator/GCD, num.denominator/GCD);
        printRational(l);
    }

    public static Rational add(Rational num, Rational numSum) {
        Rational sum2 = new Rational(0,0);
        if(num.denominator == numSum.denominator) {
            sum2.numerator = num.numerator + numSum.numerator;
            sum2.denominator = num.denominator;
            return sum2;
        }
        else {
            sum2.numerator = num.numerator * numSum.denominator;
            sum2.denominator = num.denominator * numSum.denominator;
            numSum.numerator = numSum.numerator * num.denominator;
            numSum.denominator = numSum.denominator * num.denominator;

            sum2.numerator += numSum.numerator;

            int last, num1, num2;
            num1 = sum2.numerator;
            num2 = sum2.denominator;
            last = num1 % num2;
            while(last != 0) {
                last = num1 % num2;
                num1 = num2;
                num2 = last;
            }

            int GCD = num1;

            sum2.numerator = sum2.numerator/GCD;
            sum2.denominator = sum2.denominator/GCD;

            return sum2;
        }
    }
    public static void main(String[] args) {
        Rational num  = new Rational(0,0);
        Rational num2 = new Rational(2, 3);


        negate(num);
        printRational(num);

        invert(num);
        printRational(num);

        double doubleValue = toDouble(num);
        System.out.println(doubleValue);

        reduce(num);
        printRational(add(num, num2));

    }


}

