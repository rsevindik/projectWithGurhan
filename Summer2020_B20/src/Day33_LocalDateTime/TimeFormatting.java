package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeFormatting {
    /*
        year: yy, yyyy
		Month: MM(number), MMM(three letters), MMMM(full Name)
		days: dd
		days name: E(three letters), EEEE(full name)
    */
    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MMM for Jun, Jul and MMMM for full name

        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);

        System.out.println(ld.format(dateFormat));

        /*
        hours: hh
		minutes: mm
		seconds: ss
		am/pm: a
     */

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        System.out.println("======Example:May/20/2019 Dayname 4:30 pm=====");

        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);

        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");

        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);
        System.out.println(Now.format(dtf));


        System.out.println("======current: Monday, 12:49 AM, Jul/27/20==================");
        DateTimeFormatter currentFormat = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yy");

        System.out.println(LocalDateTime.now().format(currentFormat));




    }
}
