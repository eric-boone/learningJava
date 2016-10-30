
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int size = array.length;

        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int size = array.length;

        int[] newArrayRev = new int[size];

        for (int i = 0; i < array.length; i++) {
            newArrayRev[i] = array[array.length - i - 1];
        }

        return newArrayRev;
    }

}
