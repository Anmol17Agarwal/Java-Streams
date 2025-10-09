import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfEachElement {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,4,2,6,4,10,4,2,9,6,7,3);

        Map<Integer,Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));

        System.out.println(frequency);
    }
}
