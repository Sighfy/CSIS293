/*
Write a program that accepts the
names of three political parties
and the number of votes each received
in the last mayoral election.
Display the percentage of the
vote each party received.
 */
import java.util.Scanner;
public class ElectionStatistics
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double totalVotes, party1Percent, party2Percent, party3Percent;
        double party1Votes, party2Votes, party3Votes;
        String party1, party2, party3;

        System.out.println("enter name of party and number of votes");
        party1 = input.nextLine();
        party1Votes = input.nextDouble();
        System.out.println("enter name of party and number of votes");
        party2 = input.next();
        party2Votes = input.nextDouble();
        System.out.println("enter name of party and number of votes");
        party3 = input.next();
        party3Votes = input.nextDouble();

        totalVotes = party1Votes + party2Votes + party3Votes;
        party1Percent = (party1Votes / totalVotes) * 100;
        party2Percent = (party2Votes / totalVotes) * 100;
        party3Percent = (party3Votes / totalVotes) * 100;

        System.out.println("The percentages of the votes each party got");
        System.out.println(party1 + " Party: " + party1Percent + "%");
        System.out.println(party2 + " Party: " + party2Percent + "%");
        System.out.println(party3 + " Party: " + party3Percent + "%");
    }
}
