/*
In Chapter 1 you created a program named Triangle in which you
displayed a seven-line triangle pattern like the one in Figure
6-33 by using a series of println() statements. Now, using your
knowledge of loops, revise the program so that it contains no
more than three output statements.
 */
class TriangleWithLoops
{
    public static void main(String[] args)
    {
        int n = 7, spaces = 7;
        for(int i = 0; i < n; i++)
        {
            for(int k = 0;k<spaces;k++)
            {
                System.out.print(" ");
            }
            spaces--;
            for(int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("T");
            }
            System.out.println();
        }
    }
}
