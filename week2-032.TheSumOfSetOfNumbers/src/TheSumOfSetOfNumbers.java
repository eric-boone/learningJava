
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what?");
        int num = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        int count = 0;
        
        while(count <= num){
            sum += count;
            count++;
        }
        
        System.out.println("Sum is " + sum);

    }
}
