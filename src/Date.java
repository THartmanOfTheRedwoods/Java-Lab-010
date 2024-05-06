public class Date {

    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 0;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date bDay = new Date(2005, 7, 26);
        System.out.printf("My birthday is %d/%d/%d", bDay.month, bDay.day, bDay.year);
    }
}
