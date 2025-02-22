import java.util.Scanner;

public class MirrorNumberPyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
         
        for(int i=1;i<=n;i++){
            for (int j = 0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
            System.out.print(k);
            } 
            System.out.println();
        }

        sc.close();
    }
}
