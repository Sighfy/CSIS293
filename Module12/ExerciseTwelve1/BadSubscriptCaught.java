import java.util.*;
public class BadSubscriptCaught
{
    public static void main(String[] args)
    {
        String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
                "Fred", "Gina", "Henry"};
        Scanner keyboard = new Scanner(System.in);
        int number;

        try
        {
            System.out.print("Enter a number >> ");
            number = keyboard.nextInt();
            System.out.print(names[number]);
        }
        catch(Exception e)
        {
            System.out.print("Subscript out of range");
        }

    }
}