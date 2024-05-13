public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int inMonth, int inDay, int inYear) {
        this.year = inYear;
        this.month = inMonth;
        this.day = inDay;
    }


    public static void main(String[] args) {
        Date birthday = new Date(11, 5, 2000);
        System.out.println("Birthday: " + birthday.month + "/" + birthday.day + "/" + birthday.year);
        Rational rational = new Rational(1,3);
        System.out.println(rational);
    }
}

