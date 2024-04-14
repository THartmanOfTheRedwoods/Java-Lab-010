public class Date {
    private int year;
    private int month;
    private int day;

    // Constructor with no parameters
    public Date() {
        this(1970, 1, 1);
    }

    // Constructor with parameters
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static void main(String[] args) {
        Date birthday = new Date(1996, 12, 13);
        System.out.println(birthday.year + "/" + birthday.month + "/" + birthday.day);
    }
}

