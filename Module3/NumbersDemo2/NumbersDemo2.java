/*
Modify the NumbersDemo class to accept the values of the two integers from a user at the keyboard.
 */

import java.util.Scanner;
public class NumbersDemo2
{
    // Modify the code below
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        System.out.print("Please enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Please enter the second number: ");
        num2 = keyboard.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}
