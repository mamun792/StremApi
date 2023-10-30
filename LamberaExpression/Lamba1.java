package LamberaExpression;

public interface Lamba1 {
    // void show();
    // void add(int a, int b);
    int add(int a, int b);
}

/**
 * InnerLamba1
 */
// class InnerLamba1 implements Lamba1 {

// @Override
// public void show() {
// System.out.println("Hello World");
// }
// }

/**
 * InnerLamba1_1
 */
class SimpleLambera {
    public static void main(String[] args) {
        // Lamba1 lamba1 = () -> System.out.println("Hello World");
        // lamba1.show();

        // Lamba1 lamba1 = (n1, n2) -> System.out.println(n1 + n2);
        // lamba1.add(10, 20);

        // Lamba1 lamba1 = (n1, n2) -> n1 + n2;//return n1 + n2; way1
        Lamba1 lamba1 = (n1, n2) -> { // way2
            return n1 + n2;
        };
        System.out.println(lamba1.add(10, 20));
    }
}