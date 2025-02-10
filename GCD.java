/* Find the Greatest Common Divisor (GCD) using the Euclidean Method.
Write a program to find the GCD (Greatest Common Divisor) of two numbers.*/

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
    
        while(b!=0){         // Because always remain 0 in Euclidean Method
            int temp =b;
            b = a%b;
            a= temp;
        }
        System.out.println(a);
    scan.close();
    }
}
