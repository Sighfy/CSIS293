/*
Add a prompt to the ShadyRestRoom application to ask the user to specify a
(1) lake view or a
(2) park view,
but ask only if the bed size entry is valid.
Add $15 to the price of any room with a lake view.
If the view value is invalid, display a
you selected an invalid option and assume that the price is for a room with a lake view.
 */
import java.util.Scanner;
public class ShadyRestRoom2
{
    public static void main (String args[])
    {
        int selection;
        int price;
        String result;
        final int QUEEN = 1, KING = 2, SUITE = 3;
        final int QPRICE = 125, KPRICE = 139,
                SPRICE = 165;
        final String QSTRING = "Queen bed",
                KSTRING = "King bed",
                SSTRING = "Suite with a king bed and pull-out couch",
                INVALIDSTRING = "an invalid option";

        Scanner in = new Scanner(System.in);
        System.out.println("\t\n\nMenu\n");
        System.out.println("(" + QUEEN + ") " + QSTRING);
        System.out.println("(" + KING + ") " + KSTRING);
        System.out.println("(" + SUITE + ") " + SSTRING);
        System.out.print("Enter Selection (1, 2, or 3) >> ");
        selection = in.nextInt();

        if(selection == QUEEN)
        {
            result = QSTRING;
            price = QPRICE;
        }
        else
        if(selection == KING)
        {
            result = KSTRING;
            price = KPRICE;
        }
        else
        if (selection == SUITE)
        {
            result = SSTRING;
            price = SPRICE;
        }
        else
        {
            result = INVALIDSTRING;
            price = 0;
        }
        // variables for view selection
        final int LAKE = 1;
        final int PARK = 2;
        final String LSTRING = "Lake View";
        final String PSTRING = "Park View";
        int choice;
        if (selection == QUEEN || selection == KING || selection == SUITE)
        {
            System.out.println("\t\n\nMenu\n");
            System.out.println("(" + LAKE + ") " + LSTRING);
            System.out.println("(" + PARK + ") " + PSTRING);
            System.out.print("Enter Selection (1 or 2) >> ");
            choice = in.nextInt();

            if (choice == LAKE)
            {
                price = price + 15;
            }
            else if (choice == PARK)
            {
                price = price;
            }
            else
            {
                result = INVALIDSTRING;
                price = price + 15;
            }
        }
        else
        {
            result = INVALIDSTRING;
            price = price + 15;

        }
        System.out.println("You selected " + result + "  $" + price);
    }
}
