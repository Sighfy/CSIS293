import java.util.*;
public class DebugNine2
{
    public static void main(String[] args)
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        // Initialize array
        Movie[] movies = new Movie[8];
        // int i; (the variable isnt used in the code)
        // Declare the variables
        String message, entry;
        // add elements to the movies[] array
        movies[0] = new Movie("The Godfather", 1972);
        movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966); //[1]
        movies[2] = new Movie("Pulp Fiction", 1994); // [2]
        movies[3] = new Movie("Shindler's List", 1993); // [3]
        movies[4] = new Movie("Casablanca", 1942);
        movies[5] = new Movie("Wizard of Oz", 1939);
        movies[6] = new Movie("Citizen Kane", 1941);
        movies[7] = new Movie("Some Like It Hot", 1959);
        // Prompt the user to select how to sort the array
        System.out.println( "Sort Movies by\n(N)ame, or (Y)ear");
        // Read the user input
        entry = input.next();
        // Check if the user enters 'Y'
        if(entry.charAt(0) == 'Y')
        {
            // Call the yearSort() method
            yearSort(movies);
            message = "Sorted by Year\n";
        }
        else
        {
            // Call the nameSort() method
            nameSort(movies);
            message = "Sorted by Name\n";
        }
        // Call the display() method
        display(movies, message);
    }
    // Declare the nameSort() method to sort according to the movie name
    public static void nameSort(Movie[] array)
    {
        // Declare the necessary variables
        int a, b;
        Movie temp;
        // Assign the length of the array to highSub variable
        int highSub = array.length;
        for(a = 0; a < highSub; ++a)
        {
            for(b = 0; b < highSub; ++b)
            {
                // Check whether the variable b is less than 7
                // This is to avoid exceeding the index
                if (b < 7)
                {
                    // Assign the name of movie at index b to the variable first
                    String first = array[b].getName();
                    // Assign the name of movie at index b + 1 to the second variable
                    String second = array[b + 1].getName();
                    // Check if first string is greater than second string
                    if(first.compareTo(second) > 0) // fixed parenthesis
                    {
                        // Swap the places of both the elements
                        temp = array[b];
                        array[b] = array[b + 1]; // fixed the swap
                        array[b + 1] = temp; // temp
                    }
                }
            }
        }
    }
    // Define the yearSort() method to sort according to the year the movie was released
    public static void yearSort(Movie[] array)
    {
        // Declare the necessary variables
        int a, b;
        Movie temp;
        // Assign length - 1 of the array to the variable highSub
        int highSub = array.length - 1;
        for (a = 0; a < highSub; ++a)
        {
            for (b = 0; b < highSub; ++b) // fixed the {}
            {
                // Check if the year of the element at index b is
                // greater than that of the element at index b+1
                if (array[b].getYear() > array[b + 1].getYear())
                {
                    // Swap the places of both the elements
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }
    // Define the display() method
    public static void display(Movie[] s,  String msg)
    {
        // Assign the length of the array to len
        int len = s.length;
        for (int i = 0; i < len; i++)
            msg = msg + s[i].getName() + ", " + s[i].getYear() + "\n";
        // Display the sorted array
        System.out.println(msg);
    }
}