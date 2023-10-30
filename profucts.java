import java.util.ArrayList;
import java.util.List;

public class profucts {
    private String name;
    private int price;
    private int quantity;

    public profucts(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}

class Inventory {

    public static void main(String[] args) {
        List<profucts> products = new ArrayList<>();
        products.add(new profucts("Mamin", 100, 10));
        products.add(new profucts("Rahman", 200, 20));
        products.add(new profucts("Rahim", 300, 30));
        products.add(new profucts("Karim", 400, 40));

        products.stream().filter(p -> p.getPrice() > 200).forEach(str -> System.out.println(str.getPrice()));

        products.stream().filter(p -> p.getPrice() > 200).map(n -> n.getName()).forEach(System.out::println);
    }
}