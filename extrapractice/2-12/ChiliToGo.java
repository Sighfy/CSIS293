/*
The Huntington Boys and Girls Club is conducting
a fundraiser by selling chili dinners to go.
The price is $7.00 for an adult meal and $4.00 for
a child’s meal. Write a program that accepts the
number of adult meals ordered and then children's
meals ordered. Display the total money collected
for adult meals, children’s meals, and all meals.
 */
import java.util.Scanner;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final double CHILD_MEAL_COST = 4.00, ADULT_MEAL_COST = 7.00;
        double aMeal, cMeal, totalMealsCost, totalChildMeals, totalAdultMeals;
        System.out.print("How many Adult meals would you like? >> ");
        aMeal = input.nextDouble();
        System.out.print("How many Child meals would you like? >> ");
        cMeal = input.nextDouble();
        totalAdultMeals=ADULT_MEAL_COST*aMeal;
        totalChildMeals=CHILD_MEAL_COST*cMeal;
        totalMealsCost=totalAdultMeals+totalChildMeals;
        System.out.println("Total money collected for:"
                +"\nadults: "+totalAdultMeals
                +"\nchildren: "+totalChildMeals
                +"\ntotal for all meals: "+totalMealsCost);
    }
}
