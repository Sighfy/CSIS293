/*
Create an application named NumbersDemo whose main() method holds two integer variables. Assign values to the variables.

In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().

Create each method to perform the task its name implies.
 */


public class NumbersDemo
{
    public static void main (String args[])
    {
        int var1 = 2;
        int var2 = 3;

        displayTwiceTheNumber(var1);
        displayTwiceTheNumber(var2);

        displayNumberPlusFive(var1);
        displayNumberPlusFive(var2);

        displayNumberSquared(var1);
        displayNumberSquared(var2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        int num;
        num = n * 2;

        System.out.print(num + "\n");
    }
    public static void displayNumberPlusFive(int n)
    {
        int num;
        num = n + 5;

        System.out.print(num + "\n");
    }
    public static void displayNumberSquared(int n)
    {
        int num;
        num = n * n;

        System.out.print(num + "\n");

    }
}