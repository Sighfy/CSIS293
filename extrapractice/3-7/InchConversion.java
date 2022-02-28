/*
There are 12 inches in a foot and 3 feet in a yard.

Create a class named InchConversion. Its main()
method accepts a value in inches from a user at
the keyboard, and in turn passes the entered value
to two methods. One converts the value from inches
to feet, and the other converts the same value from
inches to yards.

Each method displays the results with appropriate explanation.
 */
import java.util.Scanner;

public class InchConversion
{
    public static void main(String[] args)
    {
        double inches;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches >> ");
        inches = input.nextInt();
        convertToFeet(inches);
        convertToYards(inches);
    }
    public static void convertToFeet(double inches)
    {
        System.out.println("In Feet: "+inches/12);
    }
    public static void convertToYards(double inches)
    {
        System.out.println("In Yards: "+inches/(12*3));
    }
}
