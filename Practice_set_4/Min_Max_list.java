import java.util.Random;
import java.util.Vector;

public class Min_Max_list {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            arr.add(rand.nextInt(i * 10));
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                max = arr.get(i);
                min = arr.get(i);
            } else {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                } else if (min > arr.get(i)) {
                    min = arr.get(i);
                }
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
