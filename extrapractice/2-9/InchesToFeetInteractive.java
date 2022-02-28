/*
Write an interactive version of the
InchesToFeet class that accepts the
inches value from a user.
 */
import java.util.Scanner;
class InchesToFeetInteractive
{
    public static void main(String[] args) {
        // Modify the code
        Scanner input = new Scanner(System.in);

        final int INCHES_IN_FOOT = 12;
        int inches;
        int feet;
        int inchesLeft;

        System.out.print("Enter inches please: ");
        inches = input.nextInt();
        feet = inches / INCHES_IN_FOOT;
        inchesLeft = inches % INCHES_IN_FOOT;
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }
}
