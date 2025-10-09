import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> languages = List.of("Java","Python","JavaScript","Java","C++","Java");

        List<String> distinct = languages.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
}
