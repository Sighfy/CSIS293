public abstract class DebugBoat
{
    String boatType = new String();
    int passengers; // added a ;
    String power = new String();
    public DebugBoat(String bt)
    {
        boatType = bt;
    }
    // otherBoat is an object of DebugBoat so the datatype is DebugBoat
    // Parameter passed is DebugBoat otherBoat
    public boolean equals(DebugBoat otherBoat)
    {
        boolean result;
        if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
            result = true;
        else
            result = false;
        return result; // added a ;
    }
    public String toString()
    {
        return("This " + boatType + "boat carries " + passengers +
                " and is powered by "  + power); // added a " where needed
    }
    public abstract void setPower();
    public abstract void setPassengers();
}
