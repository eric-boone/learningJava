
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2, 7};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int lastSpot = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(lastSpot);
    }
}
