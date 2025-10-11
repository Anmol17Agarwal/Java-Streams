import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineTwoList {
    //
//    Combine All Lists into a Unique Sorted List
//    Input : List 1 = 1, 3, 5, 7 ,
//    List2 = 2, 3, 4, 8
//    output : 1, 2, 3, 4, 5, 7, 8
//    using java 8


    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,3,5,7);
        List<Integer> list2 = List.of(2,3,4,8);

        List<Integer> combine = Stream.concat(list1.stream(),list2.stream()).distinct().sorted().collect(Collectors.toList());
        System.out.println(combine);

    }
}
