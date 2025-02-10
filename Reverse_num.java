// Reverse a Number

import java.util.*;

public class Reverse_num {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = 0,reminder, remain;
        
        do{
        reminder =num%10;
        remain = num/10;
        result= result*10 + reminder;
        num = remain;
        }while(remain!=0);
        System.out.println(result);
        s.close();
    } 
}
