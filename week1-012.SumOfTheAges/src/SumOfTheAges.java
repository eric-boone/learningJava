
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name:");
        String nameA = reader.nextLine();
        
        System.out.println("Type your age:");
        int ageA = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name:");
        String nameB = reader.nextLine();
        
        System.out.println("Type your age:");
        int ageB = Integer.parseInt(reader.nextLine());
        
        int averageAge = ageA + ageB;
        
        System.out.println(nameA +
                           " and " +
                           nameB + 
                           " are " + 
                           averageAge +
                           " years old in total.");
    }
}
