// Fibonacci Series up to N Terms

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a1 = 0, a2 = 1, newNum;
        System.out.print(0 + " " + 1 + " ");
        for (int i = 0; i < n - 2; i++) {
            newNum = a1 + a2;
            a1 = a2;
            a2 = newNum;
            System.out.print(newNum + " ");
        }
        scan.close();
    }
}
