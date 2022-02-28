public class Sandwich
{
    // the private data members
    private String MainIngredient;
    private String bread;
    private double price;

    // the public get and set methods
    public void setMainIngredient(String ingredient)
    {
        MainIngredient = ingredient;
    }
    public String getMainIngredient()
    {
        return MainIngredient;
    }

    public void setBread(String breadType)
    {
        bread = breadType;
    }
    public String getBread()
    {
        return bread;
    }

    public void setPrice(double amt)
    {
        price = amt;
    }
    public double getPrice()
    {
        return price;
    }
}
