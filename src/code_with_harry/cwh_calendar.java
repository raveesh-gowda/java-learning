package code_with_harry;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_calendar {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal);
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone().getID());
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.SECOND));

        GregorianCalendar gCal = new GregorianCalendar();
        System.out.println(gCal.isLeapYear(2024));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[66]);
    }

}
