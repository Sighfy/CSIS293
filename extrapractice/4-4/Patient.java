/*
Create a class named Patient that includes an
ID number, age, and BloodData. Provide a default
constructor that sets the ID number to 0, the age to 0,
and the BloodData values to O and +. Create an overloaded
constructor that provides values for each field.
Also provide get methods for each field.
 */

public class Patient
{
    private String id;
    private int age;
    private BloodData bloodData;
    public Patient()
    {
        id = "0";
        bloodData = new BloodData();
    }
    public Patient(String id, int age, String bType, String rhFactor)
    {
        this.id = id;
        this.age = age;
        bloodData = new BloodData(bType, rhFactor);
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public BloodData getBloodData()
    {
        return bloodData;
    }
    public void setBloodData(BloodData b)
    {
        bloodData = b;
    }
}
