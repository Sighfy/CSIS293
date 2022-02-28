/*
Write an application that prompts a user for a month, day, and year.
Then display the appropriate message:

Y is not this year
M was a month earlier this year
M is a month later this year
M is this month
 */

import java.util.*;
import java.time.*;
public class PastPresentFuture
{
    public static void main (String args[])
    {
        LocalDate today = LocalDate.now();

        int month, day, year;
        int todayMonth, todayDay, todayYear;

        Scanner input = new Scanner(System.in);

        todayMonth = today.getMonthValue();
        todayDay = today.getDayOfMonth();
        todayYear = today.getYear();

        System.out.print("Enter a month >> ");
        month = input.nextInt();
        System.out.print("Enter a day >> ");
        day = input.nextInt();
        System.out.print("Enter a year (four digits) >> ");
        year = input.nextInt();

        if (year != todayYear)
            System.out.println(year + " is not this year");
        else
            if (month < todayMonth)
                System.out.println(month + " was a month earlier this year");
            else
                if (month > todayMonth)
                    System.out.println(month + " was a month later this year");
                else
                    System.out.println(month + " is this month");
    }
}


