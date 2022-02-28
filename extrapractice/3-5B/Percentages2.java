/*
Modify the Percentages class to
accept the values of the two doubles
from a user at the keyboard.
 */
import java.util.Scanner;
public class Percentages2
{
    public static void main (String args[])
    {
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("number 1 >> ");
        num1 = input.nextDouble();
        System.out.print("number 2 >> ");
        num2 = input.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
