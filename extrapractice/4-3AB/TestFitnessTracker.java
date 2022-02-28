/*
 a. Create a FitnessTracker class that includes data fields for a fitness activity,
 the number of minutes spent participating, and the date. The class includes methods
 to get each field. In addition, create a default constructor that automatically
 sets the activity to "running", the minutes to 0, and the date to January 1 of
 the current year. Create an application that demonstrates each method works correctly.

 b. Create an additional overloaded constructor for the FitnessTracker class you
 created in Exercise 3a. This constructor receives parameters for each of the data
 fields and assigns them appropriately. Add any needed statements to the
 TestFitnessTracker application to ensure that the overloaded constructor works
 correctly, save it, and then test it.
 */

import java.time.*;
public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker exercise = new FitnessTracker();

        System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
                " minutes on " + exercise.getDate());

        // code to test constructor added for exercise 3b

        LocalDate date = LocalDate.of(2020, 8, 20);
        FitnessTracker exercise2 = new FitnessTracker("bicycling", 35, date);

        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}
