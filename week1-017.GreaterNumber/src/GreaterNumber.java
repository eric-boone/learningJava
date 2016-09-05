import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        int firstNum = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number:");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        int biggerNum;
        
        if(firstNum > secondNum){
            biggerNum = firstNum;
            System.out.println("Greater number: " + biggerNum);
        } else if(firstNum < secondNum){
            biggerNum = secondNum;
            System.out.println("Greater number: " + biggerNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
