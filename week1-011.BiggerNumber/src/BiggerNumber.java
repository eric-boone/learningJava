
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.println("Type a number: ");
        int numA = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int numB = Integer.parseInt(reader.nextLine());
        
        int biggest = 0;
        
        if(numA > numB){
            biggest = numA;
        } else {
            biggest = numB;
        }
        
        System.out.println("The bigger number of the two numbers given was: " + biggest);
    }
}
