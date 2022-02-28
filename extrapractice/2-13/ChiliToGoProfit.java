/*
In the ChiliToGo program in Exercise 12,
the costs to produce an adult meal and
a child’s meal are $4.35 and $3.10,
respectively. Adult meals are sold
for $7 and children's meals are sold
for $4. Modify the ChiliToGo program
to display the total profit for each
type of meal as well as the grand total profit.
 */
import java.util.Scanner;
class ChiliToGoProfit
{
    public static void main(String[] args) {
        // Modify the code below
        final double ADULT_PRICE = 7, ADULT_COST = 4.35;
        final double CHILD_PRICE = 4, CHILD_COST = 3.10;
        int adultMeals;
        int childMeals;
        double totalAdult, totalChild, grandTotal, childProfit,  adultProfit, totalProfit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        adultProfit = totalAdult - (adultMeals*ADULT_COST);
        childProfit = totalChild - (childMeals*CHILD_COST);
        totalProfit = adultProfit + childProfit;
        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("      Total is " + totalAdult);
        System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
        System.out.println("      Total is " + totalChild);
        System.out.println("Grand total for all meals is " + grandTotal);
        System.out.println("-------------------------------");
        System.out.println("Total profit for meals:"
                +"\nadults: "+adultProfit
                +"\nchildren: "+childProfit
                +"\ntotal profit: "+totalProfit);
    }
}
