import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int count = 0;
        String pw = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        while(count < this.length) {
            int randomNum = random.nextInt(26);
            pw += letters.charAt(randomNum);
            count++;
        }
        return pw;
    }
}
