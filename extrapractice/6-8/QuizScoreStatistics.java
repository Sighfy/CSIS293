/*
Write an application that allows a user to enter any number of student quiz scores,
as integers, until the user enters 99. If the score entered is less than 0 or more than 10,
display Score must be between 10 and 0 and do not use the score. After all the scores have
been entered, display the number of valid scores entered, the highest score, the lowest score,
and the arithmetic average.
 */
import java.util.Scanner;
public class QuizScoreStatistics
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int score;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        System.out.println("Enter the scores: (to stop enter 99) ");
        do {
            score = input.nextInt();
            if (score != 99)
            {
                if (score < 0 || score > 10)
                    System.out.println("Score must be between 10 and 0");
                else
                {
                    count++;
                    if (score < min)
                        min = score;
                    if (score > max)
                        max = score;
                    sum = sum + score;
                }
            }
        } while (score != 99);

        input.close();

        System.out.println("Number of valid scores entered: " + count);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Arithmetic Average: " + sum / (double) count);
    }
}