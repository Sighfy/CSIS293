/*
Write a program that calculates
and displays the conversion of
an entered number of dollars
into currency denominations
20s, 10s, 5s, and 1s.
Example output: $452 converted
is 22 $20s, 1 $10s, 0 $5s, and 2 $1s.
 */
import java.util.Scanner;
public class Dollars
{
    public static void main(String[] args)
    {
        int amountEntered, twentiesAmount, tensAmount, fivesAmount, onesAmount, temp;
        System.out.print("Enter amount to split into bills >> ");
        Scanner input = new Scanner(System.in);
        amountEntered = input.nextInt();
        temp = amountEntered;
        twentiesAmount = temp/20;
        temp %= 20;
        tensAmount = temp/10;
        temp %= 10;
        fivesAmount = temp/5;
        temp %= 5;
        onesAmount = temp;
        System.out.println("$"+amountEntered+" converted is "
                +twentiesAmount+" $20s, "+tensAmount+ " $10s "
                +fivesAmount+" $5s, and "+onesAmount+" $1s.");

    }
}
