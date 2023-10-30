package LamberaExpression;

import java.util.function.Consumer;

/**
 * ConsumerExample
 */

/**
 * InnerConsumerExample
 */
class Movie {
    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}

public class ConsumerExample {

    public static void main(String[] args) {
        // example 1
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        System.out.println("***********************");
        // example 2
        Consumer<Integer> c1 = i -> System.out.println(i * i);
        c1.accept(4);
        System.out.println("***********************");
        // example 3
        String[] names = { "Sunny", "Kajal", "Mallika", "Katrina", "Kareena" };
        Consumer<String> c2 = s -> System.out.println(s);
        for (String s : names) {
            c2.accept(s);
        }

        System.out.println("***********************");
        // example 4
        Consumer<String> c3 = s -> System.out.println(s);
        Consumer<String> c4 = s -> System.out.println(s.length());
        Consumer<String> c5 = c3.andThen(c4);
        c5.accept("Sunny");
        System.out.println("***********************");
        // example 5
        Consumer<Movie> c6 = m -> {
            System.out.println("Movie name: " + m.name);
            System.out.println("Movie hero: " + m.hero);
            System.out.println("Movie heroine: " + m.heroine);
        };
        Movie m1 = new Movie("Bahubali", "Prabhas", "Anushka");
        c6.accept(m1);
        System.out.println("***********************");
    }
}