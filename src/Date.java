public class Date {
     int year;
     int month;
     int day;

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

    public String toString() {
        return String.format("%02d:%02d:%04d\n", this.year, this.month, this.day);
    }
    public static void main(String[] args) {
        Date birthday = new Date(2024, 4, 13);
       String s = birthday.toString();
    }
}
