/*
Acme Parts runs a small factory and employs workers who are paid one of
three hourly rates depending on their shift:
first shift, $17 per hour;
second shift, $18.50 per hour;
third shift, $22 per hour.
Each factory worker might work any number of hours per week;
any hours greater than 40 are paid at one and one-half times the usual rate.
In addition, second- and third-shift workers can elect to participate in the
retirement plan for which 3% of the worker’s gross pay is deducted from the paychecks.

Write a program that prompts the user for hours worked, shift, and, if the shift
is 2 or 3, whether the worker elects the retirement (1 for yes, 2 for no). Display:

1. Hours worked
3. Hourly pay rate
4. Regular pay
5. Overtime pay
6. Total of regular and overtime pay
7. Retirement deduction, if any
8. Net pay
2. Shift
 */

import java.util.*;
public class AcmePay
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);

        final double FIRST_SHIFT = 17.00;
        final double SECOND_SHIFT = 18.50;
        final double THIRD_SHIFT = 22.00;
        final int FULL_WEEK = 40;
        double hoursWorked, shiftNumber, hourlyPayRate = 0, retirementOption,
                overtimePay = 0, grossPay, deduction = 0, netPay, overtimeHours = 0;

        // prompt for the shift number
        System.out.println("What shift number did you work? >> ");
        System.out.println("How many hours have you worked? >> ");
        shiftNumber = input.nextDouble();
        hoursWorked = input.nextDouble();

        // determine par rate based on shift worked
        if (shiftNumber == 1)
        {
            hourlyPayRate = FIRST_SHIFT;
        }
        else if (shiftNumber == 2)
        {
            hourlyPayRate = SECOND_SHIFT;
        }
        else if (shiftNumber == 3)
        {
            hourlyPayRate = THIRD_SHIFT;
        }
        // determine if hours worked is over 40
        if (hoursWorked > FULL_WEEK)
        {
            grossPay = hourlyPayRate * 40;
            overtimeHours = hoursWorked - FULL_WEEK;
            overtimePay = (hourlyPayRate *1.5) * overtimeHours;
            netPay = grossPay + overtimePay;

        }
        else
        {
            grossPay = hourlyPayRate * hoursWorked;
            netPay = grossPay;
        }
        // if the shift is 2 or 3
        // elect for retirement 1 for yes, 2 for no
        // retirement plan has 3% deducted from paychecks
        if (shiftNumber == 2 || shiftNumber == 3)
        {
            System.out.println("Retirement? (1 for yes, 2 for no) >> ");
            retirementOption = input.nextDouble();

            if (retirementOption == 1)
            {
                deduction = netPay * .03;
                netPay = netPay - deduction;
            }
        }

        // display results
        System.out.println("hours worked: "+ hoursWorked +
                "\nhourly pay rate: "+ hourlyPayRate +
                "\nregular pay: "+ grossPay +
                "\novertime pay: "+ overtimePay +
                "\ntotal of reg and over pay: "+ (grossPay + overtimePay) +
                "\nretirement deduction, if any: "+ deduction +
                "\nnet pay: "+ netPay +
                "\nshift number: "+ shiftNumber);

    }
}