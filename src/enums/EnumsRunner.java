package enums;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;

enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);
    //0,1,2,3

    private final int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumsRunner {

    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(Season.FALL.ordinal());
        System.out.println(Season.WINTER.ordinal());
        System.out.println(Season.SUMMER.ordinal());
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Arrays.toString(Season.values()));

        Season seasonOne = Season.valueOf("WINTER");
        System.out.println(seasonOne);
        System.out.println(seasonOne.ordinal());

        System.out.println(Season.FALL.getValue());
        System.out.println(Season.WINTER.getValue());
        System.out.println(Season.SUMMER.getValue());
        System.out.println(Season.SPRING.getValue());

        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek.TUESDAY.ordinal());
        System.out.println(DayOfWeek.SATURDAY.ordinal());
        System.out.println(DayOfWeek.THURSDAY.ordinal());
        System.out.println(DayOfWeek.MONDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));

        Month month = Month.APRIL;
        System.out.println(month);
        System.out.println(Month.APRIL.ordinal());
        System.out.println(Month.DECEMBER.ordinal());
        System.out.println(Month.JANUARY.ordinal());
        System.out.println(Month.MAY.ordinal());
        System.out.println(Arrays.toString(Month.values()));
    }

}
