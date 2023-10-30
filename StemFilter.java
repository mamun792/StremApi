import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;

public class StemFilter {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = new ArrayList<>();
        // without stream

        // for (int n : number) {

        // if (n % 2 == 0) {

        // even.add(n);
        // }
        // System.out.println(even);
        // }

        // with stream filter

        even = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());// collect to another list
        even.forEach(System.out::println);
        ;
        System.out.println("Direct print ");
        number.stream().filter(n1 -> n1 % 2 == 0).forEach(System.out::println);// print directly
    }
}