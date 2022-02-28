/*
Write an application that prompts a user for two integers and displays every integer between them.
Display There are no integers between X and Y if there are no integers between the entered values.
Make sure the program works regardless of which entered value is larger.
 */

import java.util.Scanner;
public class Inbetween {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, diff;

        System.out.println("Enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        diff = num1 - num2;
        if (diff >= -1 && diff <= 1)
            System.out.println("There are no integers between " +
                    num1 + " and " + num2);
        else
        {
            System.out.println("The numbers between " + num1 + " and " + num2 + " include: ");
            if (num1 > num2)
            {
                for (int i = num2 + 1; i < num1; ++i)
                    System.out.println(i);
            }
            else
            {
                for (int j = num1 + 1; j < num2; ++j)
                    System.out.println(j);
            }

        }
    }
}


