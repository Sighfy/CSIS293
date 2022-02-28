public class Candle
{
    private String color;
    private int height;
    protected double price; //if it's private, it will not work.

    public String getColor() {
        return color;
    }
    public int getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setHeight(int h) {
        final double per_inch = 2;
        height=h;
        price = (height * per_inch);
    }
}