/*
Write an application that displays the strings
in the provided array alphabetically in ascending order.
 */

import java.util.*;
public class StringSort
{
    public static void main(String[] args)
    {
        String[] values =  {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};

        String temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j].compareTo(values[j + 1]) > 0) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}

/*
one solution that works but probably not what the homework wants
this version uses the array library for the sorting
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringSort
{
    public static void main(String[] args)
    {
        String[] values =  {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};

        values = Stream.of(values).sorted().toArray(String[]::new);

        System.out.print("Strings in Sorted Order: " + Arrays.toString(values));
    }
}

 */