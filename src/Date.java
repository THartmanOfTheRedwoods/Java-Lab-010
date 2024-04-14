public class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2010;
        this.month = 1;
        this.day = 1;
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String toString() {
        return day + " - " + month " - " + year;
    }
}
public class DateTester {
    public static void main(String[] args) {
        Date birthday = new Date(2003, 11, 26);
        System.out.println(birthday);
    }
}
