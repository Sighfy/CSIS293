/*
Create a class named Person that holds the following fields: two String objects for the person’s
first and last name and a LocalDate object for the person’s birthdate. Create a class named
Couple that contains two Person objects. Create a class named Wedding for a wedding planner
that includes the date of the wedding, the Couple being married, and a String for the location.

Provide constructors for each class that accept parameters for each field, and provide get methods for each field.
 */
import java.time.*;
public class TestWedding {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1986, 12, 14);
        LocalDate date2 = LocalDate.of(1984, 3, 8);
        LocalDate date3 = LocalDate.of(1991, 4, 17);
        LocalDate date4 = LocalDate.of(1992, 2, 14);
        LocalDate date5 = LocalDate.of(2016, 6, 18);
        LocalDate date6 = LocalDate.of(2016, 6, 25);
        Person bride1 = new Person("Kimberly", "Hanson", date1);
        Person groom1 = new Person("Mark", "Ziller", date2);
        Person bride2 = new Person("Janna", "Howard", date3);
        Person groom2 = new Person("Julius", "Nemo", date4);
        Couple couple1 = new Couple(bride1, groom1);
        Couple couple2 = new Couple(bride2, groom2);
        Wedding wedding1 = new Wedding(couple1, date5, "Mayfair Country Club");
        Wedding wedding2 = new Wedding(couple2, date6, "Oceanview Park");
        displayWeddingDetails(wedding1);
        displayWeddingDetails(wedding2);
    }
    public static void displayWeddingDetails(Wedding w) {
        Couple couple = w.getCouple();
        LocalDate weddingDate = w.getWeddingDate();
        String location = w.getLocation();
        Person bride = couple.getBride();
        Person groom = couple.getGroom();
        String firstBride = bride.getFirstName();
        String lastBride = bride.getLastName();
        LocalDate brideBDate = bride.getBirthDate();
        String firstGroom = groom.getFirstName();
        String lastGroom = groom.getLastName();
        LocalDate groomBDate = groom.getBirthDate();
        System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
        System.out.println("Date: " + weddingDate + "   Location: " +
                location);
        System.out.println("Bride: " + firstBride +
                " " + lastBride + " " + brideBDate);
        System.out.println("Groom: " + firstGroom +
                " " + lastGroom + " " + groomBDate);
    }
}
