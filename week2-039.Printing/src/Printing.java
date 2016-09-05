public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times 
        int count = 1;
        while(count <= amount){
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count = 1;
        while(count <= sideSize){
            printStars(sideSize);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int heightCount = 1;
        while(heightCount <= height){
            printStars(width);
            heightCount++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int stars = 1;
        int count = 1;
        while(count <= size){
            printStars(stars);
            stars++;
            count++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
