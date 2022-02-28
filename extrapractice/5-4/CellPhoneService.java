/*
Write a program for Horizon Phones, a provider of cellular phone service.
Prompt a user for maximum monthly values for talk minutes used, text messages sent,
and gigabytes of data used, and then recommend the best plan for the customer’s needs.

A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month.
A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month.
A customer who needs 500 or more minutes of talk and no data should accept either Plan C for up to 100 text messages
    at $61 per month or Plan D for 100 text messages or more at $70 per month.
A customer who needs any data should accept Plan E for up to 3 gigabytes at $79 or Plan F for 3 gigabytes or more at $87.
 */
import java.util.*;
public class CellPhoneService
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        final String planA = "Plan A is $49 per month";
        final String planB = "Plan B is $55 per month";
        final String planC = "Plan C is $61 per month";
        final String planD = "Plan D is $70 per month";
        final String planE = "Plan E is $79 per month";
        final String planF = "Plan F is $87 per month";

        int minutesTalking, textMessagesSent, gigsUsed;

        System.out.print("Enter the minutes talking >> ");
        minutesTalking = input.nextInt();
        System.out.print("Enter how many text messages >> ");
        textMessagesSent = input.nextInt();
        System.out.print("Enter how many gigs >> ");
        gigsUsed = input.nextInt();


        if (minutesTalking < 500 && textMessagesSent == 0 && gigsUsed == 0)
        {
            System.out.println(planA);
        }
        else if (minutesTalking < 500 && textMessagesSent > 0 && gigsUsed == 0)
        {
            System.out.println(planB);
        }
        else if (minutesTalking > 500 && gigsUsed == 0 && textMessagesSent <= 100)
        {
            System.out.println(planC);
        }
        else if (minutesTalking > 500 && gigsUsed == 0 && textMessagesSent > 101)
        {
            System.out.println(planD);
        }
        else if (gigsUsed < 3)
        {
            System.out.println(planE);
        }
        else if (gigsUsed > 3)
        {
            System.out.print(planF);
        }
    }
}