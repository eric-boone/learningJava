import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum = sum + num;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double i = list.size();
        double j = sum(list);
        
        return j / i;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double thing = 0;
        
        for(int num : list) {
            thing += (double)Math.pow((num) - avg, 2);
        }
        
        thing /= (list.size() - 1);
        
        return thing;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
