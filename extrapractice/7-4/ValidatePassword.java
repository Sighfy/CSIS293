/*
Write an application that prompts the user for a password that contains at least
two uppercase letters, at least three lowercase letters, and at least one digit.
Continuously reprompt the user until a valid password is entered. Display Valid
password if the password is valid; if not, display the appropriate reason(s)
the password is not valid as follows:

The password did not have enough of the following:
uppercase letters
lowercase letters
digits
 */

import java.util.*;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String password;
        int stringLength;
        final int NUM = 1;
        int upperCount = 0, lowerCount = 0, digitCount = 0, letterCount = 0;
        int numSpaces = 0;
        System.out.print("Enter a password >> ");
        password = input.nextLine();
        stringLength = password.length();
        boolean test = false;
        while (!test)
        {

            for (int i = 0; i < stringLength; i++)
            {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch))
                    upperCount++;
                else if (Character.isLowerCase(ch))
                    lowerCount++;
                else if (Character.isDigit(ch))
                    digitCount++;
            }
            if (upperCount >= NUM && lowerCount >= NUM && digitCount >= NUM)
            {
                System.out.println("Valid password");
                test = true;
            }
            else
            {
                System.out.println("The password did not have enough of the following:");
                test = false;
                if (upperCount < NUM)
                    System.out.println("uppercase letters");
                if (lowerCount < NUM)
                    System.out.println("lowercase letters");
                if (digitCount < NUM)
                    System.out.println("digits");
            }
            if (!test)
            {
                System.out.print("Enter another password >> ");
                password = input.nextLine();
                stringLength = password.length();
            }
        }
    }
}