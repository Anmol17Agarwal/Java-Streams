import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicates {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);
        Set<Integer> seen = new HashSet<>();
          List<Integer> duplicateValues =  input.stream().filter(e-> !seen.add(e)).collect(Collectors.toList());
        System.out.println(duplicateValues);

    }
}
