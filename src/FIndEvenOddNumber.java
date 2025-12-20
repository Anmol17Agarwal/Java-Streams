import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
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

        // Count even number in a list
        long evenCount = number.stream().filter(n->n%2==0).count();
        System.out.println(evenCount);

        ArrayList<Integer> listOfNumber =new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            listOfNumber.add(i);
        }
        List<Integer> divisbleByFiveAndThree =  listOfNumber.stream().filter((num->num%3==0 && num%5==0))
                .collect(Collectors.toList());
    }
}
