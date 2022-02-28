import java.util.Scanner;
public class CountByAnything
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for count");
        int count = in.nextInt();
        for (int i = count; i <= 500; i = i + count) {
            System.out.print(i+" ");
            if (i % (count*10) == 0)
            {
                System.out.println();
            }
        }
    }
}