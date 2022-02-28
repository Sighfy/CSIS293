/*
Write an application that accepts a word from a user and converts it to Pig Latin.
If a word starts with a consonant, the Pig Latin version removes all consonants
from the beginning of the word and places them at the end, followed by ay.
 */
import java.util.Scanner;

public class PigLatin
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String translate, afterTranslate;
        System.out.print("Enter a word to be translated >> ");
        translate = input.nextLine();
        afterTranslate = translate(translate);
        System.out.println(afterTranslate);
    }

    public static String translate (String original)
    {
        char ch;
        int count = 0;
        while (true)
        {
            ch = original.charAt(0);
            if (Character.isUpperCase(ch))
                ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || (ch == 'y' && count != 0))
            {
                original = original + "ay";
                break;
            }
            else
                original = original.substring(1) + original.charAt(0);

            ++count;

            if(count == original.length())
            {
                original = original + "ay";
                break;
            }
        }
        return original;
    }
}