import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    Product (int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        List <Product> Ist = new ArrayList<>();
        Ist.add(new Product(10, "IceCream"));
        Ist.add(new Product(11, "Chocolate"));
        Product p1 = new Product(10, "IceCream");
        System.out.println(Ist.indexOf(p1));
    }
}