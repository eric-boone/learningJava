import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int num = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
        
        int count = 1;
        
        while(count <= num){
            sum *= count;
            System.out.println(sum);
            count++;
        }
        
        System.out.println("Factorial is "+ sum);

    }
}