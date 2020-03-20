package test;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoField.MONTH_OF_YEAR;

public class A {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter yyyyMM = DateTimeFormatter.ofPattern("yyyyMM");
        String aae042 = now.with((temporal) -> temporal.with(MONTH_OF_YEAR, temporal.range(MONTH_OF_YEAR).getMaximum())).format(yyyyMM);
       System.out.println(aae042);
    }

}
