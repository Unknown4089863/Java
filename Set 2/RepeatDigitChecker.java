import java.util.Scanner;

public class RepeatDigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        String str = String.valueOf(n);
        int repeat = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i; j < str.length()-1; j++) {
                if (str.charAt(i) == str.charAt(j + 1)) {
                    repeat++;
                }
            }
        }
        if (repeat != 0) {
            System.out.println("Repeating digits found");
        } else {
            System.out.println("No Repeating digits");
        }

        sc.close();
    }
}
