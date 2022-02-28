import java.util.Scanner;
public class doWhileLoopDemo {
    public static void main(String[] args) {
        int testNum;
        String fruit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit that you enjoy.");
        fruit = input.nextLine();
        do{
            System.out.println("I love to eat " + fruit + "'s\n");
            System.out.println("Do you want to see it again?" + "\n" + "(1 for yes)" + "\n" + "(2 for no)" );
            testNum = input.nextInt();
        } while (testNum == 1);
    }
}
