/*
Assume that a gallon of paint covers about 350 square feet wall
space. Create an application with a main() method that prompts
the user for the length, width, and height of a rectangular room.
Pass these three values to a method that does the following:

* Calculates the wall area for a room
* Passes the calculated wall area to another
    method that calculates and returns the number
    of gallons of paint needed
* Displays the number of gallons needed
* Computes the price based on a paint price of
    $32 per gallon, assuming that the painter can
    buy any fraction of a gallon of paint at the
    same price as a whole gallon
* Returns the price to the main() method

The main() method displays the final price. For example:
You will need 2.0 gallons
The price to paint the room is $64.0
 */

import java.util.Scanner;
public class PaintCalculator {

    public static void main(String[] args) {
        //variables
        double length;
        double width;
        double height;

        //beginning messages and prompts for input
        System.out.println("Paint is $32 per gallon. One gallon covers"
                + " approximately 350 square feet.");
        System.out.println("Please enter the length, width, and height of your rectangular room.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length >> ");
        length = input.nextDouble();
        System.out.print("Enter width >> ");
        width = input.nextDouble();
        System.out.print("Enter height >> ");
        height = input.nextDouble();

        //calling the method to return values
        double wallArea = calculateArea(length, height, width);
        double gallonsNeeded = calcGallonNeeds(wallArea);
        double totalPrice = calculatePrice(gallonsNeeded);

        System.out.println("You need " + (Math.round(gallonsNeeded)) + " gallons.");
        System.out.println((Math.round(gallonsNeeded))+".0" + " gallons at $32 will be "
                + totalPrice);
    }
    //method to calculate square feet
    public static double calculateArea(double length, double height, double width)
    {
        double wallArea = (length * height) * (4) + (width);
        return wallArea;
    }
    // method to calculate gallons needed
    public static double calcGallonNeeds(double wallArea)
    {
        double gallon = 350.0;
        return (wallArea / gallon);
    }
    //method to calculate price
    public static double calculatePrice(double gallonsNeeded)
    {
        double price = 32.0;
        return (Math.round(gallonsNeeded)*price);
    }
}
