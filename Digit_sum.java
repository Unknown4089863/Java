// Find the Sum of Digits of a Number

import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int remain, reminder, result = 0;
        do {
            reminder = n % 10;
            remain = n / 10;
            result += reminder;
            n = remain;
        } while (remain != 0);

        System.out.println(result);
        scan.close();
    }
}
