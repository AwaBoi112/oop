package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(month>12 || month<1 || year<1)
            return false;
        int napokSzama[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(month==2 && leapYear(year))
            napokSzama[month-1] = 29;
        int maxnap=napokSzama[month-1];
        if(day<=maxnap && day>1)
            return true;
        return false;




    }
}
