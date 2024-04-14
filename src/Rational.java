public class Rational {
    int num;
    int denom;

    public Rational() {
        num = 0;
        denom = 1;
    }
    public Rational(int numerator, int denominator){
        num = numerator;
        denom = denominator;
    }

    public void printRational() {
        System.out.println(num +"/"+ denom);
    }
    //toString
    public String toString() {
        return num +"/"+ denom;
    }
    public void negate() {
        num = -num;
    }

     public void invert() {
        int temp = num;
        num = denom;
        denom = temp;
    }

    public double toDouble() {
        return (double) num / denom ;
    }
    /**
    public int reduce(int num, int denom) {
        if (num == 0) {
            return num;
        } else {
            return reduce(denom % num, num);
        }
    }
*/
    //not sure how to do add method without the reduce method
    public static void main(String[] args) {
        Rational rational = new Rational();
        Rational rational2 = new Rational(1, 2);
        rational.printRational();
        rational.num = 1;
        rational.denom = 2;
        rational.printRational(); //after I set instance variables to new value
        System.out.println("toString test: "+ rational);//toString test
        //rational.toDouble(); //does not work
        System.out.println("toDouble: "+ rational.toDouble());//toDouble test
        rational2.negate();
        System.out.println("Negated Rational: "+ rational2);
        rational.invert();
        System.out.println("Inverted: "+ rational);
      //  System.out.println(""+ rational.reduce(1, 2));

    }
}
