import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Find the maximum number in a list
        List<Integer> number = List.of(5,4,3,6,21,35,4,3,5,4,3);
        int max = number.stream().max(Integer::compare).orElseThrow();
        System.out.println(max);


        //Find the even number in a list
        List<Integer> even = number.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

    }
}