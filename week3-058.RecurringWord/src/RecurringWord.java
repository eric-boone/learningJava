
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        String typedWord = " ";
        
        while(true) {
            System.out.println("Type a word:");
            typedWord = reader.nextLine();
            
            if(words.contains(typedWord)) {
                break;
            }
            
            words.add(typedWord);
            
        }
        
        System.out.println("You gave the word " + typedWord + " twice");
    }
}
