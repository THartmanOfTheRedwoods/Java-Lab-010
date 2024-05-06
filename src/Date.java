public class Date {
    private int year;
    private int month;
    private int day;
    public Date() {
        this.year = 2024;
        this.month = 4;
        this.day = 13;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date birthday = new Date(2004, 2, 17);
        System.out.println("Birthday: " + birthday.year + "/" + birthday.month + "/" + birthday.day);
    }
}
