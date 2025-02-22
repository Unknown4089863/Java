import java.util.*;
public class RepeatingDigitsChecker2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
 int n = sc.nextInt();
 sc.close();
 Set<Integer> x = new HashSet<>();
 int r=n%10;
 while(n!=0 && !x.contains(r)){
     n/=10;
     x.add(r);
     r = n%10;
}
if(n ==0){
    System.out.println("No Repeating Digits");
}else{
    System.out.println("Repeating Digits found");
}

    }
}
