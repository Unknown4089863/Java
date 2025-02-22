import java.util.Scanner;

public class ReverseAndAddUntilPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        int r = 0, temp = n, m = 0,x=0;
        while (true) {
            if(x>10){
                System.out.println(-1);
                break;
            }
            x++;
            String st = String.valueOf(n);
            int len = st.length();
            int flag = 0;
            for (int i = 0; i < len / 2; i++) {
                if (st.charAt(i) != st.charAt(len - i - 1)) {
                    flag++;
                    break;
                }
            }

            if (flag != 0) {
                while (true) {
                    r = temp % 10;
                    m = m * 10 + r;
                    temp /= 10;
                    if (temp == 0) {
                        n += m;
                        break;
                    }
                }
            } else {
                System.out.println(n);
                break;
            }
        }

        sc.close();
    }
}
