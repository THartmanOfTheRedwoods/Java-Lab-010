public class Date {
    private int year;
    private int month;
    private int day;

    // First constructor: no parameters, initializes a default date
    public Date() {
        this.year = 1970; // Default year
        this.month = 1;   // Default month (January)
        this.day = 1;     // Default day (1st)
    }

    // Second constructor: takes parameters year, month, and day to initialize instance variables
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters and setters (not explicitly mentioned in the requirements, but useful)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static void main(String[] args) {
        // Creating a new Date object named birthday using the second constructor
        Date birthday = new Date(2000, 5, 15); // Assuming birthdate is May 15, 2000
        // Alternatively, you could use the first constructor if you want to use default values:
        // Date birthday = new Date();

        // Outputting the birthday date
        System.out.println("Birthday: " + birthday.getYear() + "-" + birthday.getMonth() + "-" + birthday.getDay());
    }
}
