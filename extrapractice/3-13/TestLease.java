/*
Create a class named Lease with fields that hold an apartment tenant’s
name, apartment number, monthly rent amount, and term of the lease in months.
Include a constructor that initializes the name to “XXX”, the apartment number
to 0, the rent to 1000, and the term to 12. Also include methods to get and
set each of the fields. Include a nonstatic method named addPetFee() that
adds $10 to the monthly rent value and calls a static method named explainPetPolicy()
that explains the pet fee as follows: A pet fee of $10 is added to the monthly rent.

Create a class named TestLease whose main() method declares four Lease objects.
Call a getData() method three times. Within the method, prompt a user for values
for each field for a Lease, and return a Lease object to the main() method where
it is assigned to one of main()’s Lease objects. Do not prompt the user for values
for the fourth Lease object, but let it continue to hold the default values.
Then, in main(), pass one of the Lease objects to the showValues() method that displays
the data. Then call the addPetFee() method using the passed Lease object and confirm
that the fee explanation statement is displayed. Next, call the showValues() method
for the Lease object again and confirm that the pet fee has been added to the rent.
Finally, call the showValues() method with each of the other three objects; confirm
that two hold the values you supplied as input and one holds the constructor default values.
 */

import java.util.Scanner;
class TestLease
{
    public static void main (String args[])
    {
        Lease lease1;
        Lease lease2;
        Lease lease3;
        Lease lease4 = new Lease();
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();
        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }
    public static void showValues(Lease ls)
    {
        System.out.println("\n\nYour lease results:" +
                "\nName      : " + ls.getName() +
                "\nApartment : " + ls.getAptNumber() +
                "\nRent      : " + ls.getRent() +
                "\nTerm      : " + ls.getTerm());
    }
    public static Lease getData()
    {
        String name;
        int apt;
        double rent;
        int term;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter lessee name >> ");
        name = input.nextLine();
        System.out.print("Enter apartment number >> ");
        apt = input.nextInt();
        System.out.print("Enter rent >> ");
        rent = input.nextDouble();
        System.out.print("Enter lease term in months >> ");
        term = input.nextInt();
        input.nextLine();
        Lease temp = new Lease();
        temp.setName(name);
        temp.setAptNumber(apt);
        temp.setRent(rent);
        temp.setTerm(term);
        return temp;
    }
}