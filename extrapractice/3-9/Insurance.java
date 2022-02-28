/*
The Harrison Group Life Insurance company computes
annual policy premiums based on the age the customer
turns in the current calendar year. The premium is
computed by taking the decade of the customer’s age,
adding 15 to it, and multiplying by 20.

For example, a 34-year-old would pay $360, which is
calculated by adding the decades (3) to 15, and then
multiplying by 20.

Write an application that prompts a user for the current
year then a birth year. Pass both to a method that calculates
and returns the premium amount, and then display the returned amount.
 */

import java.util.Scanner;

class Insurance {
    public static void main (String args[])
    {
        // declare input
        Scanner input = new Scanner(System.in);
        // declare variables
        int curr, birth, premiumRate;
        System.out.print("What year is it? >> ");
        curr = input.nextInt();
        System.out.print("What year were you born? >> ");
        birth = input.nextInt();
        premiumRate = calculatePremium(curr, birth);
        System.out.println("The Premium payment is: $"+premiumRate);
    }

    public static int calculatePremium(int curr, int birth)
    {
        int decade = curr-birth;
        decade = decade/10;
        int premiumAmount = (decade+15)*20;
        return premiumAmount;
    }
}
