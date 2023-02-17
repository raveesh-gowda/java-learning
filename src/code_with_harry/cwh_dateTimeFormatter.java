package code_with_harry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_dateTimeFormatter {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = date.format(dTF);
        System.out.println(myDate);
    }

}
