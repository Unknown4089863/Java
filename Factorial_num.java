// Find Factorial of a Number

import java.util.*; 
public class Factorial_num {
  public static void main(String[] args){
    Scanner  scan= new Scanner(System.in);
    int n = scan.nextInt();
    Factorial f = new Factorial();
    System.out.println(f.run(n));
    scan.close();
  }  
}

class Factorial{
  public int run(int n){
    if(n<0){
        return -1;
    }
int res=1;
for(int i=1;i<=n;i++){
    res*=i;
}
return res;    
    }
}