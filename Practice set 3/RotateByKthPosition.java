import java.util.Scanner;

public class RotateByKthPosition {
  public static void main(String[] args) {
    Arr a = new Arr();
    int[] arr=a.arr1d(); 
    Scanner sc =new Scanner(System.in);
    int n = arr.length;
    System.out.print("In Kth position Value of k is : ");
    int k = sc.nextInt();
    int temp = 0;
    k %= n;
    int dup[] = new int[n];
    for (int i = 0; i < n; i++) {
      temp = (i + k) % n;
      dup[temp] = arr[i];
    }
    for (int i : dup) {
      System.out.print(i + " ");
    }
    sc.close();
  }
}
