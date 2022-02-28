import java.util.Scanner;

public class forLoopDemo
{
    public static void main(String[] args)
    {
        int counter;
        final int LIMIT = 20;
        String fruit;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a fruit that you enjoy.");
        fruit = input.nextLine();

        System.out.println("Enjoy " + LIMIT + " " +fruit);

        for(int i = 0; i < LIMIT; i++)
        {
            System.out.println(i+1 + " I love to eat " + fruit );
        }
    }
}
