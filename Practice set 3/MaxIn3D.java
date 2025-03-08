public class MaxIn3D {
    public static void main(String[] args) {
        Arr a = new Arr();
        int[][][] arr=a.arr3d(); 

        int largestNum = arr[0][0][0];
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                    if (largestNum < k) {
                        largestNum = k;
                    }
                }
            }
        }
        System.out.println("Largest Number in 3d Array is " + largestNum);
    }
}
