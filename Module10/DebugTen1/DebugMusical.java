public class DebugMusical
        extends DebugPlay
{
    protected String composer;

    // fixed to be public
    public DebugMusical(String title, String author, String comp)
    {
        // added a super for title and suthor
        super(title, author);
        // added this.
        this.composer = comp;
    }
    public void display()
    {
        // added a +
        System.out.println("The performance is " + title +
                " by " + author  + "\nThe music for " + title +
                " is by " + composer);
    }
}
