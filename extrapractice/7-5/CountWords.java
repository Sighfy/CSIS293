/*
Write an application that counts the words in a String entered by a user.
Words are separated by any combination of spaces, periods, commas,
semicolons, question marks, exclamation points, or dashes. Figure 7-17 shows a typical execution.
 */

import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str;
        char ch;
        int x, count = 0, length;
        boolean previousCharWasPunc = false;
        System.out.print("Enter a string >> ");
        str = input.nextLine();
        length = str.length();
        for (x = 0; x < length; x++)
        {
            ch = str.charAt(x);
            if (ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
                    ch == '!' || ch == '-')
            {
                ++ count;
                if (previousCharWasPunc)
                    --count;
                previousCharWasPunc = true;
            }
            else
                previousCharWasPunc = false;
        }
        if (!previousCharWasPunc)
            ++ count;
        System.out.println("There are " + count + " words in the string");
    }
}