/*
Write an application for Cody’s Car Care Shop that shows a user a list of available services:
oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string
that corresponds to one of the options, and display the option and its price as $25, $22, $15,
or $5, accordingly. Display Invalid Entry if the user enters an invalid item.
 */
import java.util.Scanner;

public class CarCareChoice
{
    public static void main(String[] args)
    {
        boolean match = false;
        Scanner in = new Scanner(System.in);
        String[] choices =
                {
                        "oil change", "tire rotation", "battery check", "brake inspection"
                };
        int[] prices = {25, 22, 15, 5};
        int matchIndex = 0;
        String menu = "Enter selection: ";
        int x = 0;
        for (x = 0; x < choices.length; ++x)
            menu += "\n    " + choices[x];
        System.out.println(menu);
        String option = in.nextLine();

        for (x = 0; x < choices.length; x++)
            if(option.equals(choices[x]))
            {
                match = true;
                matchIndex = x;
            }
        if (match)
            System.out.println(option + " price is $" + prices[matchIndex]);
        else
            System.out.println("invalid entry");
    }
}
