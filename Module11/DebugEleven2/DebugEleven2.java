// An array for different boat types
public class DebugEleven2
{
    public static void main(String[] args)
    {
        DebugBoat[] ref = new DebugBoat[3];
        DebugRowboat blueBoat = new DebugRowboat(); // added new
        DebugRowboat redBoat = new DebugRowboat(); // added new
        DebugOceanLiner bigBoat = new DebugOceanLiner(); // added new
        ref[0] = redBoat;
        ref[1] = blueBoat;
        ref[2] = bigBoat;
        for(int x = 0; x < ref.length; ++x) // defined x with int
        {
            ref[x].setPassengers();
            ref[x].setPower();
            String str = ref[x].toString(); // added the line
            System.out.println(str); // added the line
        }
    }
}
