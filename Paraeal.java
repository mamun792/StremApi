import java.util.Arrays;
import java.util.List;

class Paraeal {
    private String name;
    private int score;

    public Paraeal(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class StudentApp {

    public static void main(String[] args) {

        List<Paraeal> paraeals1 = Arrays.asList(
                new Paraeal("Mamin", 20),
                new Paraeal("Rahman", 21),
                new Paraeal("Rahim", 22));

        // paraeals1.stream()
        // .filter(p -> p.getScore() > 20)
        // .map(Paraeal::getName)
        // .forEach(System.out::println);

        paraeals1.parallelStream()
                .filter(p -> p.getScore() > 20)
                .map(g -> g.getName())
                .forEach(name -> System.out.println(name));
    }
}