//Import Scanner
import java.util.Scanner;

public class PartyAffiliation {
    String party = "";

    public void getParty(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party [D,R,I] or other: ");

        //Get Party
        party = in.nextLine();

        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man.");
        }
        else{
            System.out.println("You chose Other.");
        }


    }
}
