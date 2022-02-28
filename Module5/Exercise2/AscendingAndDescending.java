/*
Write an application that asks a user to enter three integers.
Display them in ascending and descending order.
 */

import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter three numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        System.out.println("In ascending order: ");
        ascendingOrder(num1,num2,num3);
        System.out.println("In descending order: ");
        descendingOrder(num1,num2,num3);

    }
    public static void ascendingOrder(int num1, int num2, int num3)
    {
        if(num1 >= num2)
        {
            if(num1 >= num3)
            {
                if(num3 >= num2)
                    System.out.println(num2 + " " + num3 + " " + num1);
                else
                    System.out.println(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.println(num2 + " " + num1 + " " + num3);
        }
        else
        {
            if(num2 >= num3)
            {
                if(num3 >= num1)
                    System.out.println(num1 + " " + num3 + " " + num2);
                else
                    System.out.println(num3 + " " + num1 + " " + num2);
            }
            else
                System.out.println(num1 + " " + num2 + " " + num3);
        }
    }
    public static void descendingOrder(int num1, int num2, int num3)
    {
        if(num1>=num2)
        {
            if(num1>=num3)
            {
                if(num3>=num2)
                    System.out.println(num1 + " " + num3 + " " + num2);
                else
                    System.out.println(num1 + " " + num2 + " " + num3);
            }
            else
                System.out.println(num3 + " " + num1 + " " + num2);
        }
        else
        {
            if(num2>=num3)
            {
                if(num3>=num1)
                    System.out.println(num2 + " " + num3 + " " + num1);
                else
                    System.out.println(num2 + " " + num1 + " " + num3);
            }
            else
                System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}