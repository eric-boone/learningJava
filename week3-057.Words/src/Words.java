import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String typedWord = " ";
        
        while(!typedWord.isEmpty()){
            System.out.println("Type a word:");
            typedWord = reader.nextLine();
            words.add(typedWord);
        }
        
        for(String word : words) {
            System.out.println(word);
        }
    }
}
