public class Date {

    int year, month, day;

    public Date() {

    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {


        int birthYear = 1979;
        int birthMonth = 9;
        int birthDay = 29;


        Date date1 = new Date();
        date1.year = birthYear;
        date1.month = birthMonth;
        date1.day = birthDay;


        Date date2 = new Date(birthYear, birthMonth, birthDay);
    }
}