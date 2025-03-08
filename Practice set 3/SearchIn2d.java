import java.util.Scanner;

public class SearchIn2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr array = new Arr();
        int[][] arr = array.arr2d();

        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("( " + i + " , " + j + " )");
                    return;
                }
            }
        }
        System.out.println("Element not found");

    }
}
