// Written by: Austin Barnett
// Date: 4/10/2024
// Version 1.0
public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 1986;
        this.month = 7;
        this.day = 27;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date birthday = new Date();
        System.out.println("Birthday: " + birthday.year + "-" + birthday.month + "-" + birthday.day);
    }
}
