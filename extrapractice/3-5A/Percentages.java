/*
Create an application named Percentages whose main()
method holds two double variables. Assign values to the variables.

Pass both variables to a method named computePercent()
that displays the two values and the value of the first
number as a percentage of the second one. For example,
if the numbers are 2.0 and 5.0, the method should display
a statement similar to “2.0 is 40 percent of 5.0.”

Then call the method a second time, passing the values in reverse order.

For testing use the values 2.0 and 5.0.
 */
public class Percentages
{
    public static void main(String[] args)
    {
        double value1 = 2.0 , value2 = 5.0;

        computePercent(value1, value2);
        computePercent(value2, value1);
    }
    public static void computePercent(double x, double y)
    {
        double total = x + y, percent;
        percent = (x/y)*100;

        System.out.println(x+" is "+percent+" percent of "+y);
    }
}
