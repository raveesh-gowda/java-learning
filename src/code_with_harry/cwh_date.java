package code_with_harry;

import java.util.Date;

public class cwh_date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }

}
