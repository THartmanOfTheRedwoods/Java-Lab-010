public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date birthday = new Date(1978,02,12);
    }
}
