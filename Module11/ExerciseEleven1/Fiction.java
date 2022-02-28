public class Fiction
        extends Book
{
    double fictionPrice;
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    @Override
    public void setPrice()
    {
        price = 24.99;
    }
}
