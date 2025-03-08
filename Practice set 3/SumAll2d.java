import java.util.Scanner;

public class SumAll2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr array = new Arr();
        int[][] arr = array.arr2d();

        int sum=0;
        for(int[] i:arr){
            for(int j:i){
sum+=j;
            }
        }
System.out.println("The Sum of all elements in 2D is "+sum);
       sc.close();
    }
}
