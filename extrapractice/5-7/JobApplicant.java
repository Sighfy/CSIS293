/*
Create a class in JobApplicant.java that holds data about a job applicant.
Include a name, a phone number, and four Boolean fields that represent whether
the applicant is skilled in each of the following areas: word processing,
spreadsheets, databases, and graphics. Include a constructor that accepts
values for each of the fields. Also include a get method for each field.
The get method should be the field name prefixed with 'get'. For example,
the get method for name should be called getName.
 */
public class JobApplicant
{
    private String name;
    private String phone;
    private boolean hasWordSkill;
    private boolean hasSpreadsheetSkill;
    private boolean hasDatabaseSkill;
    private boolean hasGraphicsSkill;

    public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g)
    {
        this.name = name;
        this.phone = phone;
        hasWordSkill = w;
        hasSpreadsheetSkill = s;
        hasDatabaseSkill = d;
        hasGraphicsSkill = g;
    }
    public String getName()
    {
        return name;
    }
    public String getPhone()
    {
        return phone;
    }
    public boolean getHasWordSkill()
    {
        return hasWordSkill;
    }
    public boolean getHasSpreadsheetSkill()
    {
        return hasSpreadsheetSkill;
    }
    public boolean getHasDatabaseSkill()
    {
        return hasDatabaseSkill;
    }
    public boolean getHasGraphicsSkill()
    {
        return hasGraphicsSkill;
    }
}
