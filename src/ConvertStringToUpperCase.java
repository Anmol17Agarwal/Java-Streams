import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anmol","Agarwal","Sanjay","Agarwal");

        List<String> toUpperCase = names.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
        System.out.println(toUpperCase);
    }
}
