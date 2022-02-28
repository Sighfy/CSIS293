public class ScentedCandle
        extends Candle
{
    private String scent;

    public String getScent() {
        return scent;
    }
    public void setScent(String sc) {
        scent = sc;
    }
    @Override
    public void setHeight(int h) {
        final double per_inch = 3;
        super.setHeight(h); //super takes the original parent values
        price = (h * per_inch);
    }
}