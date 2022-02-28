/*
Below are the lyrics for the song “The Twelve Days of Christmas.” The song contains a list of
gifts received for the holiday. The list is cumulative so that as each “day” passes, a new verse
contains all the words of the previous verse, plus a new item.

On the 12th day of Christmas
My true love gave to me
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three French hens
Two turtle doves and
A partridge in a pear tree

Write an application that displays the words to the song starting with any day the user enters.
(Hint: Use a switch statement with cases in descending day order and without any break statements
so that the lyrics for any day repeat all the lyrics for previous days.)

 */
import java.util.*;
public class TwelveDays
{
    Scanner input = new Scanner(System.in);
    public static void main (String args[])
    {
        int choice;
        String entry;
        double total = 0;
        double price;
        choice = getChoice();
        String suffix;
        if(choice >= 4)
            suffix = "th";
        else
        if(choice == 3)
            suffix = "rd";
        else
        if(choice == 2)
            suffix = "nd";
        else
            suffix = "st";

        System.out.println("\nOn the " + choice + suffix +
                " day of Christmas\n" +
                "My true love gave to me");
        switch(choice)
        {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static int getChoice()
    {
        Scanner in = new Scanner(System.in);
        int choice;
        String entry;
        System.out.println("From what day do you\n" +
                "want to start the song\n" +
                "The Twelve Days of Christmas?");
        entry = in.nextLine();
        choice = Integer.parseInt(entry);
        return choice;
    }
}


