
import java.util.Scanner;

public class TraceofSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix of (eq 1 ,2 etc. ) : ");
        int matrix = sc.nextInt();
        Arr array = new Arr();
        int[][] arr = array.arr2d(matrix, matrix);
        int Trace = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == arr[i][i]) {
                    Trace += arr[i][i];
                    break;
                }
            }
        }
        System.out.println(Trace);
        sc.close();
    }
}
