import java.util.Scanner;

public class OddlyDivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        int result = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                if (i % 3 == 0) {
                    result += i;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}
