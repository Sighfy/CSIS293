/*
Write a program that declares two LocalDate objects,
jan31 and dec31, and assign values that represent
January 31 and December 31 in the current year.
Display output that demonstrates the dates displayed
when one, two, and three months are added to each of the objects.
 */
import java.time.*;
public class TestMonthHandling {
    public static void main(String[] args) {
        LocalDate jan31 = LocalDate.of(2020, 1, 31);
        LocalDate dec31 = LocalDate.of(2020, 12, 31);
        System.out.println("First date " + jan31);
        System.out.println("Second date " + jan31.plusMonths(1));
        System.out.println("Third date " + jan31.plusMonths(2));
        System.out.println("Fourth date " + jan31.plusMonths(3));
        System.out.println("First date " + dec31);
        System.out.println("Second date " + dec31.plusMonths(1));
        System.out.println("Third date " + dec31.plusMonths(2));
        System.out.println("Fourth date " + dec31.plusMonths(3));
    }
}
