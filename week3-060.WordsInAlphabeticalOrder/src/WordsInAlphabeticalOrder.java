
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words= new ArrayList<String>();
        
        String typedWord = " ";
        while(!typedWord.isEmpty()) {
            System.out.println("Typa a word:");
            typedWord = reader.nextLine();
            words.add(typedWord);
        }
        
        Collections.sort(words);
        
        for(String word : words) {
            System.out.println(word);
        }
    }
}
