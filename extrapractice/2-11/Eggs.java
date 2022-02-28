/*
Meadowdale Dairy Farm sells organic
brown eggs to local customers. It charges
$3.25 for a dozen eggs, or
45 cents for individual eggs
that are not part of a dozen.
Write a program that prompts a user for the
number of eggs in the order and then display
the amount owed with a full explanation using
the following wording:
You ordered 27 eggs.
That’s 2 dozen at $3.25 per dozen and
3 loose eggs at 45 cents each for a total of $7.85.

 */
import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final double COST_PER_DOZEN_EGGS = 3.25, SINGLE_EGG = .45;
        final int DOZEN = 12;
        int eggs, eggsLeft, dozen;
        double total;
        System.out.print("Enter how many eggs you want: ");
        eggs = input.nextInt();
        dozen = eggs / DOZEN;
        eggsLeft= eggs%DOZEN;
        total = (dozen*COST_PER_DOZEN_EGGS)+(eggsLeft*SINGLE_EGG);
        System.out.println("You ordered "+eggs+" eggs.");
        System.out.println("That's "+dozen+" dozen at $"+COST_PER_DOZEN_EGGS+" per dozen and "+eggsLeft
        +" loose eggs at "+SINGLE_EGG+" cents each for a total of $"+total+".");
    }
}
