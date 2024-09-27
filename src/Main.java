import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String partyAfil;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your party affiliation [D, R, I]: ");
        partyAfil = console.nextLine();

        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (partyAfil.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man");
        } else {
            System.out.println("Invalid party affiliation. Please enter D, R, or I.");
        }

        console.close();
    }
}
