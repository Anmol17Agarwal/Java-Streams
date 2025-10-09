import java.util.Arrays;
import java.util.List;

public class FindSumProduct {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);

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
    }
}
