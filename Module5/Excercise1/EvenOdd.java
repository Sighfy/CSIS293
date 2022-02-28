import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args)
    {
        int number;
        boolean testNum;
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        number = input.nextInt();
        testNum = isEven(number);

        //System.out.println(" here is a test for passing value: " + testNum);

        if (testNum == true)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }
    public static boolean isEven(int number)
    {
        boolean result;
        if (number % 2 == 1)
            result = false;
        else
            result = true;
        return result;
    }
}
