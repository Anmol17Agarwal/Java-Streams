import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,4,2,6,4,10,4,2,9,6,7,3);

        int secondHighestNumber = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(secondHighestNumber);
    }
}
