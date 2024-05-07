public class Date {

    private int year;
    private int month;
    private int day;

    public Date(){
        int year, month , day;
        year=2024;
        month=4;
        day=13;
        Date today= new Date(year, month,day);
    }
    public Date(int year, int month, int day){
        this.year=year;
        this.day=day;
        this.month=month;
    }

    public static void main(String[] args) {
        Date birthday=new Date(2002,2,26);

    }
}
