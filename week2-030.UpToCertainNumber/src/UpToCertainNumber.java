
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number?");
        int counter = Integer.parseInt(reader.nextLine());
        int count = 1;
        while(count <= counter){
            System.out.println(count);
            count++;
        }
    }
}
