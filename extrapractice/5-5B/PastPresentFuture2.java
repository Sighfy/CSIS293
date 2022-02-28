/*
Use the web to learn how to use the LocalDate Boolean methods
isBefore(), isAfter(), and equals(). Use your knowledge to
write a program that prompts a user for a month, day, and year,
and then displays a message specifying whether the entered day
is in the past, is today (the current date), or is in the future.
 */

import java.util.*;
import java.time.*;
public class PastPresentFuture2
{
    public static void main (String args[])
    {
        LocalDate today = LocalDate.now();
        LocalDate enteredDate;
        int mo, da, yr;
        int todayMo, todayDa, todayYr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month >> ");
        mo = input.nextInt();
        System.out.print("Enter a day >> ");
        da = input.nextInt();
        System.out.print("Enter a year (four digits) >> ");
        yr = input.nextInt();

        // Write your code here
        enteredDate = LocalDate.of(yr, mo, da);
        if(enteredDate.isBefore(today))
            System.out.println(enteredDate + " is in the past");
        else
        if(enteredDate.equals(today))
            System.out.println(enteredDate + " is today");
        else
            System.out.println(enteredDate + " is in the future");

    }
}


