package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
