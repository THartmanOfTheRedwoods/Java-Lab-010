

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
    this.year = 2002;
    this.month = 4;
    this.day = 2;
    }

    public Date ( int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

        public static void main(String[] args) {
        Date birthday = new Date(2002, 4, 2);
        System.out.println("My birthday is on, " + birthday.year + "-" + birthday.month + "-" + birthday.day);
        }



}
