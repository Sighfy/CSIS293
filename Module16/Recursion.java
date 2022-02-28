/*
Write the java code in IntelliJ or Eclipse
for the recursive method that will print
out the numbers from 5 down to 1 when we
call the method with the number 5.

Include your source code in a Word doc and
take screenshots of your output and include
the images in the Word Doc. Save as PDF file
and upload.
 */

import java.util.Scanner;

public class Recursion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter a number you want to count down from using recursion in the code >> ");
        x = input.nextInt();
        recursion(x);
        System.out.print(".");
    }

    public static void recursion(int x)
    {
        if (x > 0)
        {
            System.out.print(" "+x);
            recursion(x - 1);
        }
    }
}
