public class LargestAndSmallest {
public static void main(String[] args) {
 Arr array = new Arr();
 int arr[] = array.arr1d();

System.out.println("Largest Number is "+largest(arr));
System.out.println("Smallest Number is "+smallest(arr));

}
static int largest(int arr[]){
    int largestNum =arr[0];
    for(int i:arr){
        if(largestNum<i){
            largestNum =i;
        }
    }
    return largestNum;
}
static int smallest(int arr[]){
    int smallestNum =arr[0];
    for(int i:arr){
        if(smallestNum>i){
            smallestNum =i;
        }
    }
    return smallestNum;
}
}