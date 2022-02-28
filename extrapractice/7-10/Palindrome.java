/*
Write an application that determines whether a phrase entered by the user is a palindrome.
A palindrome is a phrase that reads the same backward and forward without regarding
capitalization or punctuation. For example, “Dot saw I was Tod”, “Was it a car or a cat I
saw?”, and “Madam, I’m Adam” are palindromes. Display the appropriate feedback: You entered
a palindrome or You did not enter a palindrome.
 */

import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a string >> ");
        inputString = in.nextLine();
        String newString = inputString.toLowerCase();

        int length  = newString.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++)
        {
            if (newString.charAt(begin) == newString.charAt(end))
            {
                begin++;
                end--;
            }
            else
                break;
        }
        if (i == middle + 1)
            System.out.println("You entered a palindrome");
        else
            System.out.println("You did not enter a palindrome");
    }
}
