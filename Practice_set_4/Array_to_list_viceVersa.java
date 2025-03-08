import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_to_list_viceVersa {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};

        List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(li);

        int arr1[] = li.stream().mapToInt(Integer::intValue).toArray();
System.out.println(Arrays.toString(arr1));
System.out.println();

    }
}
