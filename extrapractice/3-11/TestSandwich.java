/*
Create a class named Sandwich that contains the following data fields:

    MainIngredient - of type String
    Bread - of type String
    Price - of type Double

Include get and set methods for these fields. The methods should
be prefixed with 'get' or 'set' respectively, followed by the field
name using camel case. For example, setMainIngredient.

Use the application named TestSandwich that instantiates one
Sandwich object and demonstrates the use of the set and get
methods to test your class.

 */
class TestSandwich
{
    public static void main (String args[])
    {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient("tuna");
        sandwich.setBread("wheat");
        sandwich.setPrice(4.99);
        System.out.println("You have ordered a " +
                sandwich.getMainIngredient() + " sandwich on " +
                sandwich.getBread() + " bread, and the price is " + sandwich.getPrice());
    }
}


