import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Find the maximum number in a list
        List<Integer> number = List.of(5,4,3,6,35,21,4,3,5,4,3);
        int max = number.stream().max(Integer::compare).orElseThrow();
        System.out.println(max);

        //Find the even number in a list
        List<Integer> even = number.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        // Count even number in a list
        long evenCount = number.stream().filter(n->n%2==0).count();
        System.out.println(evenCount);
        
        //Covert list of strings to uppercase
        List<String> element = List.of("anmol","agarwal");
//        List<String> upper = element.stream().map(n->)

        //Convert List of numbers to square of it
        List<Integer> square = number.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(square);

        //Square even number from list
        List<Integer> evenSquare = number.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(evenSquare);

        //Find the Number greater than 10
        List<Integer> greaterThanTen = number.stream().filter(n->n>10).limit(1).collect(Collectors.toList());
        System.out.println(greaterThanTen);

        //Find the first Number greater than 10
        Optional<Integer> first = number.stream().filter(n->n>10).sorted().findFirst();
        System.out.println(first.get());

        //Find sum of number in list
        int sum = number.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //Find product of numbers
        int product = number.stream().reduce(1,(c,d)->c*d);
        System.out.println(product);

        //Find the sum of even  number in list
        int evenSum = number.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
        System.out.println(evenSum);

        //Find the square of even number in list
        int squareSum = number.stream().filter(n->n%2==0).map(n->n*n).reduce(1,(a,b)->a*b);
        System.out.println(squareSum);

        //Find max number from list
        Optional<Integer> maxNumber = number.stream().reduce(Integer::max);
        System.out.println(maxNumber.get());
    }
}