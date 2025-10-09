import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumberEvenOdd {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,3,4,5,7,4,3,2,7,9,6);

        Map<Boolean, List<Integer>> partition = number.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partition);

    }
}
