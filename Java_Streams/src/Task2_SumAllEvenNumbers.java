import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_SumAllEvenNumbers {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);



//        reduce(0, sumofnum)  identity 0 is to set sum to 0 initially or if there are no elements then sum 0
//        Stream reduction is an operation that returns one value by combining the elements of a stream.
//        The Java stream API contains a set of predefined reduction operations, such as average() , sum() , min() , max() , and count()


//        int sumOfEvenNumbers = integerList.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        int sumOfEvenNumbers = integerList.stream().filter(n -> n % 2 == 0).reduce(10, Integer::sum);
        System.out.println(sumOfEvenNumbers);
    }
}
