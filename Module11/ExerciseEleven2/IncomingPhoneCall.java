public class IncomingPhoneCall extends PhoneCall
{
    public final static double RATE = .02;
    public IncomingPhoneCall(String num)
    {
        super(num);
        setPrice(0.02);
    }
    public void getInfo()
    {
        System.out.println("Number : "+ phoneNumber);
        System.out.println("Price : "+ price);
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price;
    }
}
