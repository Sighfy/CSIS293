// Looks up author of selected books
import java.util.*;
class DebugNine1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] books = new String[6][2];
        books[0][0] = "Ulysses";
        books[0][1] = "James Joyce";
        books[1][0] = "Lolita"; // added a ;
        books[1][1] = "Vladimir Nabokov";
        books[2][0] = "Huckleberry Finn"; // changed from [2][2] to [2][1]
        books[2][1] = "Mark Twain";
        books[3][0] = "Great Gatsby";
        books[3][1] = "F. Scott Fitzgerald"; // it was out of bounds
        books[4][0] = "1984";
        books[4][1] = "George Orwell";
        books[5][0] = "Sound and the Fury"; // fixed [] out of bounds
        books[5][1] = "William Faulkner";

        String entry,
                shortEntry,
                message = "Enter the first three characters of a book title omitting \"A\" or \"The\" ";
        int num, x;
        boolean isFound = false; // change to false
        while(!isFound)
        {
            System.out.println(message);
            entry = input.next();
            shortEntry = entry.substring(0,3);
            for(x = 0; x < books.length; ++x)
                if(books[x][0].startsWith(shortEntry))
                {
                    isFound = true;
                    System.out.println(books[x][0] + " was written by " + books[x][1]); // books[x][0]
                    x = books.length;
                }
            if(!isFound) //!
                System.out.println("Sorry - no such book in our database"); // fixed a "" mark error
        }
    }
}

