import java.util.Scanner;

public class AlternatingFactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.  : ");
        int n = sc.nextInt();
        long add = 0, sub = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sub += fact(i);
            } else {
                add += fact(i);
            }
        }
System.out.println(add-sub);
        sc.close();
    }

    public static int fact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
