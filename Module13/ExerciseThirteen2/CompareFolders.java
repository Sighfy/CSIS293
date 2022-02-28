/*
Write an application that determines
whether the first two files are located
in the same folder as the third one.
If the files are in the same folder
display All files are in the same folder,
otherwise display Files are not in the same folder.
 */


import java.nio.file.*;
import java.io.IOException;

public class CompareFolders
{
    public static void main(String[] args)
    {
        Path file1 = Paths.get("/root/sandbox/TestData1.txt");
        Path file2 = Paths.get("/root/sandbox/TestData2.txt");
        Path file3 = Paths.get("/root/sandbox/test/TestData3.txt");
        if(file1.getParent().equals(file3.getParent()) && file2.getParent().equals(file3.getParent()))
        {
            System.out.println("All files are in the same folder");
        }
        else
        {
            System.out.println("Files are not in the same folder");
        }

        System.out.println(file1.getName(1));
    }
}

