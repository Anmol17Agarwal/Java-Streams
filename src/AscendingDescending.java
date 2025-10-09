import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,21,20,19,14,15,12,16,18);

        List<Integer> asc = numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> desc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(asc);
        System.out.println(desc);
    }
}
