public class DebugOceanLiner extends DebugBoat
{
    public DebugOceanLiner()
    {
        super("ocean liner ");
        setPassengers();
        setPower(); // added the line
    }
    public void setPassengers()
    {
        super.passengers = 2400;
    }
    public void setPower()
    {
        super.power = "four engines";
    }
}
