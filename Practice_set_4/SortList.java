import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 0, 4, 2, 6));
       ascending(arr);
       System.out.println(arr);
       descending(arr);
        System.out.println(arr);
    }

    public static List<Integer> ascending(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    arr.add(j,arr.get(i));
                    arr.add(i,arr.get(j+1));
                    arr.remove(i+1);
                    arr.remove(j+1);
                }
            }
        }
        return arr;
    }

    public static List<Integer> descending(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    arr.add(j,arr.get(i));
                    arr.add(i,arr.get(j+1));
                    arr.remove(i+1);
                    arr.remove(j+1);
                }
            }
        }
        return arr;
    }

}
