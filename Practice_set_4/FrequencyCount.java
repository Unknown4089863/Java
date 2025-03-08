import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> arr = new Vector<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Element : ");
            arr.add(sc.nextLine());
        }

        HashMap<String, Integer> box = new HashMap<>();
        int count = 0;
        for (String i : arr) {
            for (String j : arr) {
                if (i.equals(j)) {
                    count ++;
                }
            }
            if (!box.containsKey(i)) {
                box.put(i, count);
            }
            count = 0;
        }
        System.out.println(box);
        sc.close();
    }
}
