import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstGreaterNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Find the Number greater than 10
        List<Integer> greaterThanTen = number.stream().filter(n->n>10).limit(1).collect(Collectors.toList());
        System.out.println(greaterThanTen);

        //Find the first Number greater than 10
        Optional<Integer> first = number.stream().filter(n->n>10).sorted().findFirst();
        System.out.println(first.get());

    }
}
