// Check if a Number is Prime
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
    int n = scan.nextInt();
    double sqrt = Math.sqrt(n);
    int count=0;
    for(int i=2;i<sqrt;i++){
        if(n%i==0){
           count++;
        }
    }
    if(count>0)
    System.out.println("Non Prime Number");
    else
    System.out.println("Prime Number");
    scan.close();
    }
}
