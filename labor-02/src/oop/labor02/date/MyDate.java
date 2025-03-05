package oop.labor02.date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return this.month;
    }
    public String toString(){
        return year+" "+month+" "+day;
    }

}
