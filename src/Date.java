public class Date {

    private int year;
    private int month;
    private int day;
public Date(){
    this.year = 1;
    this.month = 1;
    this.day = 1;
    }

    public Date (int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
    }

    public static void main(String[] args){
    Date birthday = new Date (2004, 10, 04);
        System.out.println("Year: " + birthday.year + " Month: " + birthday.month + " Day: " + birthday.day);
    }


}

