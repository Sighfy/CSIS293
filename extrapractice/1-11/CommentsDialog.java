/*
Modify the Comments.java program from
Programming Exercise 1-10 so at least
one of the statements about comments
is displayed in a dialog box.
 */
import javax.swing.*;
public class CommentsDialog
{
    public static void main(String[] args)
    {
        System.out.println("Program comments are nonexecuting" +
                "statements you add to a file for documentation.");
        JOptionPane.showConfirmDialog(null,
                "Program comments are nonexecuting statements you add to a file for documentation.");
        //Program comments are nonexecuting statements you add to a file for documentation.
        /*
        Program comments are nonexecuting statements you add to a file for documentation.
         */
        /**
         * Program comments are nonexecuting statements you add to a file for documentation.
         */
    }
}