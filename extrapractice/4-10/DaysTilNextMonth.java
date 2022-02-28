/*
The LocalDate class includes an instance method named lengthOfMonth()
that returns the number of days in the month. Write an application
that uses methods in the LocalDate class to calculate how many days
are left until the first day of next month. Display the result in
accordance with this example: There are 16 days until MAY starts.
 */

import java.time.*;
import java.util.Scanner;
public class DaysTilNextMonth
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();

        int day;
        int daysTilNextMo;

        System.out.println("Today is " + today);

        day = today.getDayOfMonth();
        daysTilNextMo = today.lengthOfMonth() - day;

        System.out.println("There are " + daysTilNextMo +
                " days until " + today.plusMonths(1).getMonth() + " starts");
    }
}
