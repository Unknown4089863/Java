import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Element_List {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1,2,2,4,5,1,7));
     System.out.println(li);
     li.removeIf(target->target%2==0);
     System.out.println(li);
    }
}
