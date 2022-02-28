public class Triangle{

    public static void main(String[] args) {
        int rows = 7, line = 0;
        //Using for loop to print the white spaces before T
        for(int i = 1; i <= rows; ++i, line = 0)
        {
            for(int space = 1; space <= (rows - i); ++space)
            {
                System.out.print(" ");
            }
            //Printing T's
            while(line != (2 * i) - 1) {
                System.out.print("T");
                ++ line;
            }
            System.out.println();
        }
    }
}
