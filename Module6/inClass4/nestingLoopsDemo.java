import java.util.Scanner;
public class nestingLoopsDemo {
    public static void main(String[] args) {
        int counter;
        final int OUTER_LIMIT = 20;
        final int INNER_LIMIT = 5;
        String fruit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit that you enjoy.");
        fruit = input.nextLine();
        for (int i = 0; i < OUTER_LIMIT; i++)
        {
            System.out.println(i + 1 + " I love to eat " + fruit);
            for (int j = 0; j < INNER_LIMIT; j++)
                System.out.println(fruit);
        }
    }
}
