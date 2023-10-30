package LamberaExpression;

import java.util.function.Predicate;

/**
 * InnerPredicateExample
 */
class Employee {
    String name;
    double salary;
    String city;

    Employee(String name, double salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

}

public class PredicateExample {
    public static void main(String[] args) {
        // example 1
        Predicate<Integer> p = i -> i > 10;// Predicate is a functional interface
        System.out.println(p.test(100));
        System.out.println(p.test(5));
        System.out.println("***********************");
        // example 2
        Predicate<String> p1 = s -> s.length() > 5;
        System.out.println(p1.test("Hello"));
        System.out.println(p1.test("Hello World"));
        System.out.println("***********************");
        // example 3
        String[] names = { "Sunny", "Kajal", "Mallika", "Katrina", "Kareena" };
        Predicate<String> p2 = s -> s.length() > 5;
        for (String s : names) {
            if (p2.test(s)) {
                System.out.println(s);
            }
        }
        System.out.println("***********************");
        // example 4
        Predicate<Employee> p3 = e -> e.salary > 1000 && e.city.equals("Bangalore");
        Employee e1 = new Employee("Sunny", 10000, "Bangalore");
        System.out.println(p3.test(e1));
        Employee e2 = new Employee("Mallika", 1000, "Hyderabad");
        System.out.println(p3.test(e2));

        System.out.println("***********************");

        // example 5
        Predicate<String> p4 = Predicate.isEqual("Sunny");
        System.out.println(p4.test("Sunny"));
        System.out.println(p4.test("Bunny"));
        System.out.println("***********************");

        // example 6
        int[] x = { 0, 5, 10, 15, 20, 25, 30 };
        Predicate<Integer> p5 = i -> i % 2 == 0;
        Predicate<Integer> p6 = i -> i > 10;
        System.out.println("The numbers greater than 10 are:");
        for (int n : x) {
            if (p5.test(n)) {
                System.out.println(n);
            }
        }
        System.out.println("The even numbers are:");
        for (int n2 : x) {
            if (p6.test(n2)) {

                System.out.println(n2);
            }
        }
    }
}
