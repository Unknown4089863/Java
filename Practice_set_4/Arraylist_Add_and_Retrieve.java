import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Add_and_Retrieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Enter Name : ");
        arr.add(sc.nextLine());
        }
        for(int i=0;i<5;i++){
           System.out.print(arr.get(i)+" ");
            }
        sc.close();
    }
}
