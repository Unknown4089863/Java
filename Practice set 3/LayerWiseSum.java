public class LayerWiseSum {
    public static void main(String[] args) {
        Arr a = new Arr();
       int[][][] arr=a.arr3d(); 

    int sum=0,count=0;
       for (int i[][] : arr) {
        count++;
        for (int j[] : i) {
            for (int k : j) {
               sum+=k;
            }
        }
        System.out.println("Layer "+count+" sum = "+sum);
        sum=0;
    }
    }
}
