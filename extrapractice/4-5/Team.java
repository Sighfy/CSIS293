/*
Create a class to hold data about a high school sports team.
The Team class holds data fields for high school name
(such as Roosevelt High), sport (such as Girls’ Basketball),
and team name (such as Dolphins). Include a constructor that
takes parameters for each field, and include get methods that
return the values of the fields. Also include a public final
static String named MOTTO and initialize it to Sportsmanship!.
 */

public class Team
{
    private String name;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!";

    public Team(String name, String sport, String mascot)
    {
        this.name = name;
        this.sport = sport;
        this.mascot = mascot;
    }
    public String getName()
    {
        return name;
    }
    public String getSport()
    {
        return sport;
    }
    public String getMascot()
    {
        return mascot;
    }
}