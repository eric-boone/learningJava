import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers:");
        int num;
        
        int sum = 0;
        
        int count = 0;
        
        double average = 0;
        
        int evenNum = 0;
        
        int oddNum = 0;
        
        while(true){
            num = Integer.parseInt(reader.nextLine());
            
            if(num != -1){
                count++;
                sum += num;
                average = (double)sum / count;
                
                if(num % 2 == 0){
                    evenNum++;
                } else {
                    oddNum++;
                }
                
            }
            
            if(num == -1){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + evenNum);
                System.out.println("Odd numbers: " + oddNum);
                break;
            }
        }
    }
}
