import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToSquare {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //Convert List of numbers to square of it
        List<Integer> square = number.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(square);

        //Square even number from list
        List<Integer> evenSquare = number.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(evenSquare);

    }
}
