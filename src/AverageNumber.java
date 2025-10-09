import java.util.Arrays;
import java.util.List;

public class AverageNumber {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);

        double average = number.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(average);
    }
}
