import java.util.Scanner;
public class whileLoopDemo
{
    public static void main(String[] args)
    {
     int counter;
     final int LIMIT = 20;
     String fruit;

     Scanner input = new Scanner(System.in);

     System.out.println("Enter a fruit that you enjoy.");
     fruit = input.nextLine();

     System.out.println("Enjoy " + LIMIT + fruit);
     counter = 1;
     while(counter <= LIMIT)
     {
         System.out.print(counter + " ");
         System.out.println("I love to eat " + fruit );
         counter = counter + 1;
     }
     System.out.println();
    }
}
