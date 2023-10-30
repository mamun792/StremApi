import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
    public static void main(String[] args) {

        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> number2 = Arrays.asList(2, 4, 6, 8);
        List<Integer> number3 = Arrays.asList(3, 5, 7, 9);

        List<List<Integer>> number = Arrays.asList(number1, number2, number3);

        // number.stream().flatMap(n -> n.stream()).forEach(System.out::println);
        List<Integer> finalNumber = number.stream().flatMap(n -> n.stream().map(a -> a + 10))
                .collect(Collectors.toList());
        finalNumber.forEach(System.out::println);
    }
}
