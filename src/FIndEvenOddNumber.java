import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIndEvenOddNumber {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Find the even number in a list
        List<Integer> even = number.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        //Find the odd number in a list
        List<Integer> odd = number.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odd);
    }

}
