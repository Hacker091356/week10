//Importing scanner
import java.util.Scanner;
public class RemoveString {
    public static void main(String[] args){  
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking user for their name
        System.out.print("Enter a sentence: ");
        String sentence = userInput.nextLine();
        System.out.print("Enter a string: ");
        String string = userInput.next();
        userInput.close();
        sentence = sentence.replace(" " + string, "");
        System.out.print(sentence);

    }
  
}