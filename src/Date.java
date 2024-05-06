import java.time.LocalDate;
import java.time.Period;

public class Date {

    // Instance variables to store year, month, and day
    private final int year;
    private final int month;
    private final int day;

    // Constructor - initializes with provided year, month, and day
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters for year, month, and day
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static void main(String[] args) {
        // Create a Date object for the user's birthday (fixed date)
        Date birthday = new Date(1977, 3, 26); // March 26, 1977

        // Get today's date using LocalDate
        LocalDate today = LocalDate.now();

        // Calculate the period (difference) between today and birthday
        LocalDate birthdayLocalDate = LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDay());
        Period period = Period.between(birthdayLocalDate, today);

        // Extract years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Today's date is: " + today);
        System.out.println("Your birthday is: " + birthday.getYear() + "-" + birthday.getMonth() + "-" + birthday.getDay());
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.  What was it like using rotary phones?");
    }
}
