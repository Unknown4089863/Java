import java.util.Scanner;

public class MagicalNumberTransformation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n = sc.nextInt();
         int r , res =0,temp =n,x=10000000;
        while(x>0){
            r = temp %10;
            res += r*r;
            temp/=10;
            if(temp ==0){
                if(res ==1){
                    System.out.println("Magical");
                    break;
                }else{
                    temp = res;
                    res =0;
                }
            }
            x--;
            if(x==0){
                System.out.println("Not Magical");
            }
        }

        sc.close();
    }
}
