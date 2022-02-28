/*
The Freemont Automobile Factory has discovered that the longer a worker has been on the job,
the more parts the worker can produce. Write an application that computes and displays a
worker’s anticipated output each month for 24 months assuming the worker starts by producing
4,000 parts and increases production by 6 percent each month. Also display the month in which
production exceeds 7,000 parts (when the worker deserves a raise!) as follows:
The month in which production exceeds 7000.0 is month X.
 */
public class IncreasedProduction
{
    public static void main(String[] args)
    {
        double amount = 4000;
        for(int i = 1; i <= 24; i++)
        {
            System.out.printf("\nMonth : " + i + " : Production : %.2f " ,amount);
            if(amount >= 7000)
            {
                System.out.println("The month in which production exceeds 7000.0 is month "+i);
            }
            amount = amount * 1.06; // increasing the production by 6%
        }
    }
}