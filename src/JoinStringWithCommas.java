import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithCommas {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anmol","Agarwal","Sanjay","Agarwal");

        String joined = names.stream().collect(Collectors.joining(","));
        System.out.println(joined);
    }
}
