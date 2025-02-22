import java.util.Scanner;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        int r = 0;
        for (int i = a+1; i < b; i++) {
            int flag = 0;
            int temp =i;
            while (true) {
                 if(temp==0){
                    break;
                 }
                r = temp % 10;
                 if(r==0){
                    flag++;
                    break;
                }
               else if (i % r != 0) {
                    flag++;
                    break;
                }
                temp =temp/10;
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
