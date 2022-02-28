/*
Write an application that computes and displays the day on
which you become(or became) 10,000 days old. For example,
if you we're born on January 1st, 2000, the output would
be I will be 10000 days old on 2027-05-19.
 */

import java.time.*;
public class TenThousandDaysOld
{
    public static void main(String[] args)
    {
        LocalDate birthday = LocalDate.of(1999, 11, 11);
        final int FACTOR = 10000;
        System.out.println("I will be " + FACTOR + " days old on " +
                birthday.plusDays(FACTOR));
    }
}