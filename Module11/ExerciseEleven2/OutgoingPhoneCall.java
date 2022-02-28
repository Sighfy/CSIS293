public class OutgoingPhoneCall extends PhoneCall
{
    public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
        super(num);
        minutes = mins;
        setPrice(0.04);
    }
    public void getInfo()
    {
        System.out.println("Number: " + phoneNumber);
        System.out.println("Price: " + price);
        System.out.println("Total minutes: " + minutes);
        System.out.println("Total Price: " + minutes * price);
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price * minutes;
    }
}
