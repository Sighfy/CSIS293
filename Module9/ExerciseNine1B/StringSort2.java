/*
Write an application that accepts any number
of String values from a user until they
enter zzz or have entered 15 strings,
and display them in ascending order.
 */

import java.util.*;
public class StringSort2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i = 0;
        final int LIMIT = 15;
        String array[] = new String[15];
        String tmp;

        System.out.println("Enter any words to alphabetize in ascending order (zzz to stop): ");

        while(i < LIMIT){
            tmp = input.nextLine();
            if(tmp.equals("zzz")){
                break;
            }
            array[i] = tmp;
            i++;
        }
        sort(array, i);
        for(int j = 0; j < i; j++){
            System.out.print(array[j] + " ");
        }
    }

    public static void sort(String s[], int n){
        int j;
        for (int i = 1; i < n; ++i) {
            String key = s[i];
            j = i - 1;
            while (j >= 0 && s[j].compareTo(key) > 0) {
                s[j + 1] = s[j];
                j = j - 1;
            }
            s[j + 1] = key;
        }
    }
/*
doesn't work

    public static void sort2(String s[], int n){
        String temp;
        for (int i = 0; i < s.length; i++){
            for (int j = 0; j < s.length - 1; j++){
                if (s[j].compareTo(s[j+1]) > 0) {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
    }

 */
}
