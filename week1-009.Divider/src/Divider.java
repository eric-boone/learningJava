
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        float numA = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        float numB = Integer.parseInt(reader.nextLine());
        
        float solution = numA / numB;
        //System.out.println("Sum of the numbers: " + (numA + numB));
        System.out.println("Division: " + numA + " / " + numB + " = " + solution);
    }
}
