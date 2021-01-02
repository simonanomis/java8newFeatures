package dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class DateTimeTest {
    public static void main(String[] args) {
        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println("LocalDate: "+now);

        int day = now.getDayOfMonth();
        System.out.println(day);
        int month = now.getMonthValue();
        System.out.println(month);
        int year = now.getYear();
        System.out.println(year);

        //LocalTime
        LocalTime nowTime = LocalTime.now();;
        System.out.println("LocalTime: "+nowTime);

        int hour = nowTime.getHour();
        System.out.println(hour);
        int minute = nowTime.getMinute();
        System.out.println(minute);
        int second = nowTime.getSecond();
        System.out.println(second);
        int nanosecond = nowTime.getNano();
        System.out.println(nanosecond);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: "+localDateTime);

        int day1 = localDateTime.getDayOfMonth();
        System.out.println(day1);
        int month1 = localDateTime.getMonthValue();
        System.out.println(month1);
        int year1 = localDateTime.getYear();
        System.out.println(year1);
        int hour1 = localDateTime.getHour();
        System.out.println(hour1);
        int minute1 = localDateTime.getMinute();
        System.out.println(minute1);
        int second1 = localDateTime.getSecond();
        System.out.println(second1);
        int nanosecond1 = localDateTime.getNano();
        System.out.println(nanosecond1);

        //LocalDateTime example before and after
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 01, 01, 12, 00, 01, 02);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, Month.APRIL, Calendar.DAY_OF_WEEK, 12, 00, 01, 02);
        System.out.println(localDateTime2);
        System.out.println("Before six months " + localDateTime1.minusMonths(6));
        System.out.println("After six months " + localDateTime1.plusMonths(6));


        LocalDate birthday = LocalDate.of(1986, 7, 28);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        System.out.println("Your age is: " + period.getYears() + " years and months " + period.getMonths());


        //is leap year
        if (Year.of(2021).isLeap()) {
            System.out.println("Is leap year");
        } else {
            System.out.println("Is not leap year");
        }

        //Zones
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zonedDateTime);
    }
}
