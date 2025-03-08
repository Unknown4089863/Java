public class Flatten3dArray {
    public static void main(String[] args) {
        Arr array = new Arr();
        int [][][] arr = array.arr3d();
        int[] res = array.oneD(arr);
System.out.print("{ ");
array.print(res);
System.out.print(" }");

    }
}
