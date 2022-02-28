import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease input a character or number: ");
        String string = input.nextLine();
        char aChar=string.charAt(0);
        System.out.println("The character is " + aChar);
        if(Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        boolean test = Character.isDigit(aChar);
        boolean test1 = Character.isLetter(aChar);
        boolean test2 = Character.isWhitespace(aChar);
        if (test)
            System.out.println(aChar + " is a letter or digit");
        else if (test1)
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter nor digit");
        if(test2)
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }
}

/*
import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("(\\b|\\B)");
        char aChar;
        System.out.print("PLease input a character or number: ");
        aChar = input.next().charAt(0);
        System.out.println("The character is " + aChar);
        if(Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + " is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        boolean test = Character.isDigit(aChar);
        boolean test1 = Character.isLetter(aChar);
        boolean test2 = Character.isWhitespace(aChar);
        if (test)
            System.out.println(aChar + " is a letter or digit");
        else if (test1)
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter nor digit");
        if(test2)
            System.out.println(aChar + " is whitespace");
        else
            System.out.println(aChar + " is not whitespace");
    }
}

 */