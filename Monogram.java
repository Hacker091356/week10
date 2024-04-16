//Importing scanner
import java.util.Scanner;
public class Monogram {
    public static void main(String[] args){  
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking user for their name
        System.out.print("Enter your first name: ");
        String firstName = userInput.next();
        String firstInitialLower = firstName.toLowerCase();
        char firstLetter = firstInitialLower.charAt(0);
        System.out.print("Enter your middle initial: ");
        String middleInitial = userInput.next();
        String middleInitialLower = middleInitial.toLowerCase();
        char middleLetter = middleInitialLower.charAt(0);
        System.out.print("Enter your last name: ");
        String lastName = userInput.next();
        String lastNameUpper = lastName.toUpperCase();
        char lastLetter = lastNameUpper.charAt(0);
        userInput.close();

        System.out.print("Your monogram us: " + firstLetter + lastLetter + middleLetter );


    }
}