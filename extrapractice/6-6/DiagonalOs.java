/*
Write an application that uses a loop to create the pattern of Os shown in Figure 6-32,
in which each O is displayed one additional space to the right.
 */
public class DiagonalOs
{
    public static void main(String[] args)
    {
        final char O_CHAR = 'O';
        final char SPACE = ' ';
        final int ROWS = 10;
        int spaces = 0;
        int i, j;

        for (i = 0; i < ROWS; ++i)
        {
            for (j = 0; j < spaces; ++j)
                System.out.print(SPACE);
            System.out.println(O_CHAR);
            spaces ++;
        }
    }
}
