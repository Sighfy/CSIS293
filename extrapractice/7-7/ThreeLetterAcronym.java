/*
Three-letter acronyms are common in the business world. For example, in Java you use the IDE
(Integrated Development Environment) in the JDK (Java Development Kit) to write programs used
by the JVM (Java Virtual Machine) that you might send over a LAN (local area network).
Programmers even use the acronym TLA to stand for three-letter acronym. Write a program that
allows a user to enter three words, and display the appropriate three-letter acronym in all
uppercase letters. If the user enters more than three words, ignore the extra words.
 */
import java.util.*;
public class ThreeLetterAcronym
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String tla = "", threeWords;
        int stringLength, i, count = 0;
        final int MAX = 3;
        char z;
        System.out.print("Please enter three words >> ");
        threeWords = input.nextLine();
        stringLength = threeWords.length();
        tla += Character.toUpperCase(threeWords.charAt(0));
        ++count;
        for (i = 1; i < stringLength; i++)
        {
            if(count < MAX)
            {
                if (threeWords.charAt(i) == ' ')
                {
                    ++i;
                    z = threeWords.charAt(i);
                    z = Character.toUpperCase(z);
                    tla += z;
                    ++count;
                }
            }
        }
        System.out.println("The original words are: " +threeWords + "\nThe three letter acronym is " + tla);
    }
}