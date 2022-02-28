/*
Write an application that displays every perfect number from 1 through 1,000.
A perfect number is one that equals the sum of all the numbers that divide evenly
into it. For example, 6 is perfect because 1, 2, and 3 divide evenly into it, and
their sum is 6; however, 12 is not a perfect number because 1, 2, 3, 4, and 6 divide
evenly into it, and their sum is greater than 12.
 */
public class Perfect {
    public static void main (String args[])
    {
        final int MAX = 1000;
        for (int i = 1; i <= MAX; i++)
        {
            if(perfect(i) == true)
            {
                System.out.println("The number " + i + " is perfect");
            }
        }
    }
    public static boolean perfect(int n)
    {
        int sum = 1;
        boolean result = false;
        for (int j = 2; j <= n/2; j++)
            if (n % j == 0)
                sum += j;
            if (sum == n)
                result = true;
        return result;
    }
}



