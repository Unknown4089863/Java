import java.util.ArrayList;
import java.util.Random;

public class CommonElement {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(10));
        }
        for (int i = 0; i < 10; i++) {
            arr1.add(rand.nextInt(10));
        }
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(findCommonElement(arr, arr1));
    }

    public static ArrayList<Integer> findCommonElement(ArrayList<Integer> arr, ArrayList<Integer> arr1) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i : arr) {
            for (int j : arr1) {
                if (i == j && !res.contains(i)) {
                    res.add(j);
                }
            }
        }

        return res;
    }
}
