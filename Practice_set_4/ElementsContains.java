import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ElementsContains {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            arr.add(rand.nextInt(10));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Target Number (0 to 10) : ");
        int n = sc.nextInt();

        if (arr.contains(n)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");

        }

        sc.close();
    }
}
