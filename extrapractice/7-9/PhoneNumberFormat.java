/*
Write a program that inserts parentheses, a space, and a dash into a string of
10 user-entered numbers to format it as a phone number. For example, 5153458912
becomes (515) 345-8912. If the user does not enter exactly 10 digits, display an
error message. Continue to accept user input until the user enters 999.
 */
import java.util.*;

public class PhoneNumberFormat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inputNum;
        String newNum;
        final String QUIT = "999";
        final int FULL_LENGTH = 10;

        System.out.print("Enter the ten digit phone number \n(Enter " + QUIT + " to quit) >> ");
        inputNum = input.nextLine();

        while (!inputNum.equals(QUIT))
        {
            if (inputNum.length() != FULL_LENGTH)
                newNum = "Invalid";
            else
            {
                newNum = "(" + inputNum.substring(0,3) + ") " +
                        inputNum.substring(3,6) + "-" +
                        inputNum.substring(6, inputNum.length());
            }
            System.out.print("The new number is " + newNum +
                    "\nEnter the ten digit phone number \n(Enter " + QUIT + " to quit) >> ");
            inputNum = input.nextLine();
        }

    }
}