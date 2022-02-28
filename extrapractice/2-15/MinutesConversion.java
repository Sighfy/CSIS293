/*
Write a program that accepts a number of minutes
and converts it both to hours and days. For example,
6000 minutes is 100.0 hours or 4.166666666666667 days.
 */
import java.util.Scanner;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        final int MINUTES_IN_HOUR = 60, MINUTES_IN_DAY = 1440;
        double enteredValue, convertedToHours, convertedToDays;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number of minutes to be converted to hours and days >> ");
        enteredValue = input.nextDouble();
        convertedToHours = enteredValue / MINUTES_IN_HOUR;
        convertedToDays = enteredValue/ MINUTES_IN_DAY;
        System.out.println(enteredValue+" minutes is "
                +convertedToHours+" hours or "+convertedToDays+ " days.");
    }
}
