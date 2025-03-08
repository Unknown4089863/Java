import java.util.Scanner;

public class Transpose2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr array = new Arr();
        int[][] arr = array.arr2d();
        int n = arr.length;
        int m = arr[0].length;

        int dup[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dup[i][j] = arr[j][i];
            }
        }
        System.out.print("{");
        for (int[] i : dup) {
            System.out.print("{");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.print("}");
        }
        System.out.print("}");

        sc.close();
    }
}
