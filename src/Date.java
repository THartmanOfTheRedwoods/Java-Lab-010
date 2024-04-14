public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        // Default date
        this.year = 1970;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date birthday = new Date(2000, 2, 24);  // my birthday
        System.out.println("My birthday is " + birthday);
    }

    @Override
    public String toString() {
        // return as american date format
        return String.format("%02d-%02d-%04d", month, day, year);
    }
}