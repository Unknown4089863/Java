public class Reverse2dArray {
    public static void main(String[] args) {
        Arr a = new Arr();
       int[][] arr=a.arr2d(); 

       int n= arr.length;
       int m= arr[0].length;
        for (int i = 0; i < n; i++) {
            int start = 0, end = m - 1, temp;
            while (start < end) {
                temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.print("{");
        for (int[] i : arr) {
            System.out.print("{");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.print("}");
        }
        System.out.print("}");
    }
}
