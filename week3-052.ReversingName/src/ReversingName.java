import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        int count = name.length();
        int letterAtIndex = name.length() - 1;
        
        System.out.print("In reverse order: ");
        while(count > 0){
            System.out.print(name.charAt(letterAtIndex));
            count--;
            letterAtIndex--;
        }
    }
}
