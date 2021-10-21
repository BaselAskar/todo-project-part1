package org.example;

import java.time.LocalDate;
import java.time.Period;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now();
        LocalDate deadLine = LocalDate.parse("2021-10-25");

        System.out.println(today);
        System.out.println(deadLine);

        Period period = Period.between(deadLine,today);

        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
    }
}
