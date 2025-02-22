import java.util.Scanner;

public class UniqueSumSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int r=0, x=0, sum = 0;
        while (true) {
            r = n % 10;
            sum += r;
            x = n / 10;

            if(x!=0){
               n=x;
            }
           else if (sum == n ) {
                System.out.println(n);
                break;
            }else {
                n = sum;
                sum=0;
            }
            

        }
        sc.close();
    }
}
