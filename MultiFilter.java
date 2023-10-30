import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MultiFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mamin", "Rahman", "Rahim", "Karim", "Rahman", "babiual asselam");
        List<String> newname = new ArrayList<>();

        names.stream().filter(str -> str.length() > 8 && str.length() < 20).forEach(System.out::println);
    }
}
