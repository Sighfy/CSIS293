// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class DebugSeven2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String str;
        int x;
        int length;
        int start = 0;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();
        length = str.length(); //should be str.length not length()
        for(x = 0; x < length; x++) //should run upto length-1 not to the length
        {
            if(str.charAt(x) == ' ')//should be checking blank space character not string
            {
                partStr = str.substring(lastSpace + 1,x); //first index should be less than second
                num = Integer.parseInt(partStr);
                System.out.println(" " + num);
                sum = sum+num; //Should be sum = sum+num not sum = num
                lastSpace = x; //should be assignment not equality
            }
        }
        partStr = str.substring(lastSpace + 1, length);
        num = Integer.parseInt(partStr);
        System.out.println(" " + num);
        sum = sum+num; //Should be sum = sum+num not sum = num
        System.out.println(" -------------------" + "\nThe sum of the integers is " + sum);
    }
}