/*
Create a program that contains a String that holds your favorite inspirational quote.
Pass the quote to the calculateSpaces method and return the number of spaces to be displayed in the main method.
 */

public class CountSpaces
{
    public static void main(String[] args)
    {
        int numSpace;
        String inString = "Here I hold my breath";
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
