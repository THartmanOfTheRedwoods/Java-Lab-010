public class Rational {

    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator=0;
        this.denominator=1;
    }
    public Rational(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public String printRational(){
        return numerator+"/"+denominator;
    }

    public void negate(){
        if (denominator*-1==Math.abs(denominator)){
            denominator=Math.abs(denominator);
        }
        else if (numerator*-1==Math.abs(numerator)){
            numerator=Math.abs(numerator);
        }
        else numerator=numerator*-1;
        System.out.println(numerator+"/"+denominator);
    }


    public void invert() {
        int num=numerator;
        int den=denominator;
        numerator=den;
        denominator=num;
        System.out.println(numerator+"/"+denominator);
    }

    public double toDouble(){

    return denominator;
    }
    public String toString(){
        return "My rational number is "+printRational()+".";
    }

    public int reduce(int num, int den){
        while(den!=0){

            return reduce(den, num%den);
        }
        return num;
    }

    public Rational add(Rational number){
       int newnum=(number.numerator*this.denominator)+(this.numerator* number.denominator);
       int newden=(this.denominator* number.denominator);

       int gcd=reduce(newnum,newden);

       int newRationalNum=newnum/gcd;
       int newRationalDen=newden/gcd;

        return new Rational(newRationalNum,newRationalDen);
    }
    public static void main(String[] args) {
    Rational fraction= new Rational(-24,12);
    Rational newFraction= new Rational (25, 100);
    System.out.println(fraction);
    fraction.negate();
    fraction.invert();
    System.out.println("My double rational number is now "+fraction.numerator+"/"+fraction.toDouble());
    System.out.println("The greatest common divisor within the object fraction is "+ fraction.reduce(fraction.numerator,fraction.denominator));
    fraction.add(fraction);

    }
}
