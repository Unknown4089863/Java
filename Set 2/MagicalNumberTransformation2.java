import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class MagicalNumberTransformation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

Set<Integer> x = new HashSet<>();
while(n!=1 && !x.contains(n)){
x.add(n);
    n= SquareOfDigits(n);
}

if(n==1){
    System.out.println("Magical");
}
else{
    System.out.println("Not Magical");
}
        sc.close();
    }

   static int SquareOfDigits(int n) {
        int r, res = 0;
        while (n > 0) {
            r = n % 10;
            res += r * r;
            n /= 10;
        }
        return res;
    }
}
