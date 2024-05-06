/**
 * @author Alexei Iachkov
 * @date 4-13-2024
 * @version 1.0
 */

public class DeliciousDates {
    private int year;
    private int month;
    private int day;

    public DeliciousDates() {
        this.year = 1970; //epoch date in context of Unix time
        this.month = 1;
        this.day = 1;
    }
    public DeliciousDates(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static void main (String[] args) {
        DeliciousDates birthday = new DeliciousDates(1998, 7, 16); //uses constructor with 3 arguments
    }
}
