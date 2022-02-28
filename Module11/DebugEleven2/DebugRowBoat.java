class DebugRowboat extends DebugBoat
{
    public DebugRowboat()
    {
        super("row");
        setPower();
        // calling the setPassengers() method defined in DebugBoat
        setPassengers();
    }
    public void setPassengers()
    {
        super.passengers = 2;
    }
    public void setPower() // capitalize P
    {
        super.power = "oars";
    }
}
