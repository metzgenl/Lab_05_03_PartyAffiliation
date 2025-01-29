//Import Scanner
import java.util.Scanner;

public class PartyAffiliation {
    String party = "";

    public void getParty(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party [D,R,I] or other: ");

        //Menu for user's choice
        party = in.nextLine();
        party = party.toUpperCase();

        switch(party) {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an Independent Man.");
                break;
            default:
                System.out.println("You chose Other.");
        }

    }
}
