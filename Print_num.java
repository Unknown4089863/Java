/*Write a program that takes an integer N as input and prints numbers from 1 to N using a loop.*/
import java.util.Scanner;
public class Print_num {
    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int n =scan.nextInt();
   for(int i=1;i<=n;i++){
    System.out.print(i + " ");
   }
   scan.close();
    }
}