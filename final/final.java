/*
This is the one programming problem worth 140 points.
Recommend that you skip this question and come back to it once you have completed all the multiple choice questions.

Write a program that allows a user to enter any number of student quiz scores, as integers, until the user enters 99.
If the score entered is less than 0 or more than 10, display "Score must be between 10 and 0" and do not use the score
in the average calculation, but still display the score if the invalid number was highest or lowest. After all the
scores have been entered, display the number of valid scores entered, the highest score, the lowest score, and the
arithmetic average.  See below for example output.

Write the program in IntelliJ or Eclipse.  Take screenshots of your outputs in IntelliJ or Eclipse and place the image
in a Word document.  Copy your "text" source code (not image of source code) into the same Word document.
Save your Word doc as PDF and upload it here.

When you run the program, input the following test cases in order:

  Enter -1

  Enter 11

  Enter 5

  Enter 8

  Enter 3

  Enter 0

  Enter 10

  Enter 11

  Enter 9

  Enter 99


Output should look something similar to this:

Enter a score >> -1
Score must be between 10 and 0 Enter another score or 99 to quit >> 11
Score must be between 10 and 0 Enter another score or 99 to quit >> 5
Enter another score or 99 to quit >> 8
Enter another score or 99 to quit >> 3
Enter another score or 99 to quit >> 0
Enter another score or 99 to quit >> 10
Enter another score or 99 to quit >> 11
Score must be between 10 and 0 Enter another score or 99 to quit >> 9
Enter another score or 99 to quit >> 99
6 valid scores were entered
Highest was 10
Lowest was -1
Average was 5.833333333333333



Grading Rubric (Total: 140 points):

Pseudocode: 10 points

Comments: 10 points

Style: 10 points

Output: 50 points

Logic: 60 points
 */
import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // declare variables
        int score, high = 0, low = 0, sum = 0, count = 0;
        double avg;

        // ask for the number and initialize the high and low variables with the number
        System.out.print("Enter a score >> ");

        // the do-while loop for validation and number entering (99 to quit)
        do
        {
            // take the input from the loop and from the initial request
            score = input.nextInt();

            // quit if 99 is entered inside while loop
            if (score!= 99)
            {
                // number validation
                if (score < 0 || score > 10)
                {
                    System.out.print("Score must be between 10 and 0 ");
                }
                else
                {
                    sum = sum + score;
                    count++;

                    // find the highest value (within the numbers 1 - 10)
                    // to find the true highest value of all numbers entered, move this block down with the lowest value
                    if (high < score)
                    {
                        high = score;
                    }
                }

                // find the lowest value (outside of 1 - 10)
                // (to mimic output of given example, keep this outside of previous else)
                if (low > score)
                {
                    low = score;
                }

                // ask and enter more numbers for the loop
                System.out.print("Enter another score or 99 to quit >> ");
            }
        }
        while(score != 99); // quit if 99 is the first number entered

        // find the average of the numbers entered
        avg = (double)sum / count;

        // all of the output to the console
        System.out.println(count + " valid scores were entered");
        System.out.println("Highest was " + high);
        System.out.println("Lowest was " + low);
        System.out.println("Average was " + avg);
    }
}