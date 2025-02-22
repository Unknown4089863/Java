import java.util.Scanner;

public class CyclicRotationOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.  : ");
        int n = sc.nextInt();
        int r = 0, x = 0, div = 1;
        int m = n;
        while (true) {
            r = m / 10;
            if (r != 0) {
                x++;
                m = r;
            } else {
                break;
            }
        }
        for (int i = 0; i < x; i++) {
            div *= 10;
        }
        int res = n % div;
        res = res * 10 + (n / div);

        System.out.println(res);
        sc.close();
    }
}
