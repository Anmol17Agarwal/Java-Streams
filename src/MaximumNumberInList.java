import java.util.List;
import java.util.Optional;

public class MaximumNumberInList {
    public static void main(String[] args) {
        List<Integer> number = List.of(5,4,3,6,35,21,4,3,5,4,3);

        //Find max number from list
        Optional<Integer> maxNumber = number.stream().reduce(Integer::max);
        System.out.println(maxNumber.get());

        //Find the maximum number in a list with Optional
        int max = number.stream().max(Integer::compare).orElseThrow();
        System.out.println(max);

    }
}
