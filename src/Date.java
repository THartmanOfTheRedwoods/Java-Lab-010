public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2024;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args) {
        Date birthday = new Date(16, 4, 1995);
    }
}
