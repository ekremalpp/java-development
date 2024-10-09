package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import  java.time.ZoneId;

public class FormatDates {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d , yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("eeee, MMM d, yyy HH:mm ");
        DateTimeFormatter challengeFormat = DateTimeFormatter.ofPattern("h:mm a 'on' dd/MMM/yyyy");


        System.out.println(now.format(format1));
        System.out.println(now.format(format2));
        System.out.println(now.format(format3));
        System.out.println(gmtNow.format(format4) + "GMT");

        System.out.println(now.format(challengeFormat));

    }
}
