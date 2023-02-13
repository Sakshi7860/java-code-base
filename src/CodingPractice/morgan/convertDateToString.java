package CodingPractice.morgan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class convertDateToString {
    public static String parse(String s)
    {
        s=s.replace("1st","1");
        s=s.replace("2nd","2");
        s=s.replace("3rd","3");
        s=s.replace("4th","4");
        s=s.replace("5th","5");
        s=s.replace("6th","6");
        s=s.replace("7th","7");
        s=s.replace("8th","8");
        s=s.replace("9th","9");
        s=s.replace("0th","0");
        s=s.replace("11th","11");
        s=s.replace("12th","12");
        s=s.replace("13th","13");
        System.out.println(s);
        return s;
    }
    public static void main(String[] args) {
        String date="25th March 2022";
        String str=parse(date);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate localDate=LocalDate.parse(str,formatter);
        System.out.println(localDate);


    }
}
