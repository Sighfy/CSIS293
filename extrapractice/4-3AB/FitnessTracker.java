import java.time.*;
public class FitnessTracker
{
    String activity;
    int minutes;
    LocalDate date;
    public FitnessTracker()
    {
        //3a
        //set defaults
        activity = "running";
        minutes = 0;
        date = LocalDate.ofYearDay( LocalDate.now().getYear(), 1); //1st Jan of the year
    }
    //Parameterized constructor //3b
    public FitnessTracker(String a, int m, LocalDate d)
    {
        activity = a;
        minutes = m;
        date = d;
    }
    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
}
