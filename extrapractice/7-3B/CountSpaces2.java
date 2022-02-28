/*
Write an application that counts the total number of
spaces contained in a quote entered by the user.
 */
import java.util.*;
public class CountSpaces2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numSpace;
        String inString;
        System.out.print("Enter your favorite song lyric >> ");
        inString = input.nextLine();
        numSpace = calculateSpaces(inString);
        System.out.println("The number of spaces are " + numSpace);
    }

    public static int calculateSpaces(String inString)
    {
        int stringLength = inString.length();
        int numSpaces = 0;
        for (int i = 0; i < stringLength; i++)
        {
            char ch = inString.charAt(i);
            if (ch == ' ')
                numSpaces++;
        }
        return numSpaces;
    }
}
