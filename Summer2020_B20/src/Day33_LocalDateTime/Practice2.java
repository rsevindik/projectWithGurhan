package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String [] students = {"Ramazan Sevindik", "Erdem Marsinanli", "Ali Bayraktar"};

        LocalDate[] birthDays = {LocalDate.of(1980, 8,06),
                LocalDate.of(1981, 9,12),
                LocalDate.of(1982, 4,20),
                LocalDate.of(1980, 7,22)};

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");

        for (int i = 0; i <= students.length-1 ; i++) {
            System.out.println(students[i]+" : "+ birthDays[i].format(dateFormat));

        }
    }
}
