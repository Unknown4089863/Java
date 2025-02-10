// Print Even Numbers up to N

import java.util.Scanner;

public class Even_num {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=2;i<=n;i+=2)
        System.out.print(i+" ");
        scan.close();
    }
}
