public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2024;
        this.month = 4;
        this.day = 12;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Main method
    public static void main(String[] args) {
        Date defaultDate = new Date();
        System.out.println("Default Date: " + defaultDate.getYear() + "/" + defaultDate.getMonth() + "/" + defaultDate.getDay());
        Date birthday = new Date(2003, 11, 2);
        System.out.println("Birthday Date: " + birthday.getYear() + "/" + birthday.getMonth() + "/" + birthday.getDay());
    }
}
