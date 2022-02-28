/*
Write an application that asks a user to type an even number or
the sentinel value 999 to stop. When the user types an even number,
display the message “Good job!” and then ask for another input.
When the user types an odd number, display an error message,
"x is not an even number", and then ask for another input.
When the user types the sentinel value 999, end the program.
 */
import java.util.*;
public class EvenEntryLoop
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);

        final int SENTINEL = 999;
        int number;
        String message = "Enter an even number (999 to quit) >> ";

        System.out.print(message);
        number = input.nextInt();

        while (number != SENTINEL)
        {
            if (number % 2 == 0)
                System.out.println("Good Job!");
            else
                System.out.println(number + " is not an even number");
            System.out.print(message);
            number = input.nextInt();
        }
    }
}


