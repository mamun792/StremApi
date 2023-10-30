import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class DivideMap {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even = new ArrayList<>();

        // number.stream().map(n -> n * 3).forEach(s -> System.out.println(s));
        even = number.stream().map(n -> n * 3).collect(Collectors.toList());
        even.forEach(s -> System.out.println(s));
    }
}
