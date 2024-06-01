public class Date {
    private int year;
    private int month;
    private int date;
    public Date(int year, int month, int date){
        this.date=date;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return "Year "+year+" month "+month+" date "+date;
    }
}
