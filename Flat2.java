import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Flat2 {
    public static void main(String[] args) {

        List<String> name1 = Arrays.asList("Mamin", "Rah", "Rahim", "Karim");
        List<String> name2 = Arrays.asList("Mamin", "Rahman", "Rahim", "Karim");
        List<String> name3 = Arrays.asList("Mamin", "Rahman khan", "Rahim", "Karim");
        List<List<String>> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);

        names.stream().flatMap(play -> play.stream().filter(str -> str.length() > 5).map(n -> n + " " + n.length()))
                .forEach(System.out::println);
    }
}
