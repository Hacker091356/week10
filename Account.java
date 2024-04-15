//Importing scanner
import java.util.Scanner;
public class Account {
    public static void main(String[] args){  
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking user for a password
        System.out.print("Enter a user name: ");
        String userName = userInput.next();
        System.out.print("\n Enter a password that is at least 8 characters: ");
        String password = userInput.next();
        //While password is less than 8 charactrs keep asking for password
        while (password.length() < 8)
        {
            System.out.print("\nEnter a password that is at least 8 characters: ");
            password = userInput.next();
        }
        //Closing scanner to avoid wasteage of resources
        userInput.close();
        if (password.length() >= 8)
        {
            System.out.print("Your user name is " + userName.toLowerCase() + " and your password is " + password.toLowerCase());
        }

    }

}