/*
Write a Java application that uses the Math class to determine the answers for each of the following:

The square root of 37

The sine and cosine of 300

The value of the floor, ceiling, and round of 22.8

The larger and the smaller of the character ‘D’ and the integer 71

A random number between 0 and 20 (Hint: The random() method returns a value between 0 and 1;
you want a number that is 20 times larger.)
 */

public class MathTest
{
    public static void main(String[] args)
    {
        System.out.println(" The square root of 37 is " + Math.sqrt(37) +
                "\nthe sine of 300 is " + Math.sin(300) +
                "\nthe cosine of 300 is " + Math.cos(300) +
                "\nthe floor of 22.8 is " + Math.floor(22.8) +
                "\nthe ceiling of 22.8 is " + Math. ceil(22.8) +
                "\nthe round of 22.8 is " + Math.round(22.8) +
                "\nthe larger of D and 71 is " + Math.max('D', 71) +
                "\nthe smaller of D and 71 is " + Math.min('D', 71) +
                "\na random number between 0 and 20 is " + (Math.random() * 20));
    }
}