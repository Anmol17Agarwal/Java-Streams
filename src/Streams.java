import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anmol","Agarwal","Sanjay","Agarwal");

        //1 - List to Stream
        Stream<String> stream = names.stream();
        System.out.println(stream.collect(Collectors.toList()));

        //2 - Array to Stream
        String[] arr = {"Java", "Python","C++","Go"};
        Stream<String> stream1 = Arrays.stream(arr);
        System.out.println(stream1.collect(Collectors.toList()));

        //Stream of
        Stream<Integer> integerStream = Stream.of(1,2,3,5,4);
        System.out.println(integerStream.collect(Collectors.toList()));

        //stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
        System.out.println(limit.collect(Collectors.toList()));
    }
}
