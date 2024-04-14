public class Date {
    int year;
    int month;
    int day;

    //constructor
    public Date() {
        //default date
        year = 2024;
        month = 4;
        day = 13;
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;



    }
    public static void main(String[] args) {
        Date bDay = new Date(2004, 3, 21); //birthday

        System.out.println("my birthday is " + bDay.month +"/"+ bDay.day +"/"+ bDay.year);
    }
}
