import java.util.*;
public class TryToParseDouble {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String value;
        double convert = 0.0;

        try {
            System.out.print("input here >> ");
            value = input.nextLine();
            convert = Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            convert = 0.0;
            System.out.println("Value entered cannot be converted to a floating-point number");
        }
        System.out.println(convert);
    }
}