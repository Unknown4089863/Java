import java.util.Scanner;

public class Arr{
    Scanner sc = new Scanner(System.in);

   public int[][][] arr3d(){
        System.out.print("Enter Size of 3d Array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int arr[][][] = new int[n][m][o];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.print("Enter Element : ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        
    return arr;
    }
  
    public int[][] arr2d(){
        System.out.print("Enter Size of 2d Array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    System.out.print("Enter Element : ");
                    arr[i][j] = sc.nextInt();
            }
        }
        
    return arr;
    }

    public int[] arr1d(){
        System.out.print("Enter Size of 1d Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
                    System.out.print("Enter Element : ");
                    arr[i]= sc.nextInt();
        }
    return arr;
    }  

    public int[][] arr2d(int n,int m){
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    System.out.print("Enter Element : ");
                    arr[i][j] = sc.nextInt();
            }
        }
    return arr;
    }

    public void print(int[][][] arr){
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                   System.out.print(k+" ");
                }
            }
        }
    }
  
    public void print(int[][] a){
        for (int i[]: a) {
            for (int j : i) {
                   System.out.print(j+" ");
            }
        }
    }

    public void print(int[] a){
        for (int i: a) {
          System.out.print(i+" ");
        }
    } 

    public int[] oneD(int[][][] arr){
        int [] res=new int[arr.length*arr[0].length*arr[0][0].length];
        int count=0;
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                   res[count]=k;
                   count++;
                }
            }
        }
        return res;
    }

    public int[][] twoD(int[][][] arr){
        int [][] res=new int[arr.length][arr[0].length*arr[0][0].length];
        int x=0,y=0;
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                   res[x][y]=k;
                   y++;
                }
                x++;
            }
        }
        return res;
    }


}
