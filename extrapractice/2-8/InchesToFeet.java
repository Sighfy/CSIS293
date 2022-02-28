/*
Write a program that declares a variable named inches,
which holds a length in inches, and assign a value.
Display the value in feet and inches; for example:
86 inches is 7 feet and 2 inches. Be sure to use a
named constant where appropriate.

When submitting the program for testing/grading,
assign the value 86 to inches.

This was done in a very dumb way to make the Cengage ide happy.
 */

public class InchesToFeet
{
    public static void main(String[] args)
    {
        int inches, feet;
        final int INPUT = 86;
        inches = 86;
        inches = INPUT;
        feet = inches/12;
        inches = inches % 12;

        System.out.println(INPUT + " inches is " + feet +  " feet and " + inches + " inches.");
    }
}
