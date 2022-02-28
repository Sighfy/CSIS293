/*
Write an application for the Shady Rest Hotel; the program determines the price of a room.
Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch.
The output echoes the input and displays the price of the room: $125 for queen, $139 for king,
and $165 for suite with king bed and a pullout couch. If the user enters an invalid code,
display You selected an invalid option and set the price to 0.
 */
import java.util.Scanner;
public class ShadyRestRoom
{
    public static void main (String args[])
    {
        final int QUEEN_ROOM_COST = 125;
        final int KING_ROOM_COST = 139;
        final int SUITE_ROOM_COST = 165;

        Scanner input = new Scanner(System.in);

        System.out.println("This determines the price for the selected room. \n" +
                "Enter 1-3 to select a room.");
        int num = input.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("$"+QUEEN_ROOM_COST+" for a queen");
                break;
            case 2:
                System.out.println("$"+KING_ROOM_COST+" for a king");
                break;
            case 3:
                System.out.println("$"+SUITE_ROOM_COST+" for a suite");
                break;
            default:
                System.out.println("You selected an invalid option, the price is 0");
        }

    }
}
