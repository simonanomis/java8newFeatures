package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int day = now.getDayOfMonth();
        System.out.println(day);
        int month = now.getMonthValue();
        System.out.println(month);
        int year = now.getYear();
        System.out.println(year);


        LocalTime nowTime = LocalTime.now();;
        System.out.println(nowTime);

        int hour = nowTime.getHour();
        System.out.println(hour);
        int minute = nowTime.getMinute();
        System.out.println(minute);
        int second = nowTime.getSecond();
        System.out.println(second);
        int nanosecond = nowTime.getNano();
        System.out.println(nanosecond);



    }
}
