package seminars.Shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<Product>();
        products.add(new Product(120, "Яблоки"));
        products.add(new Product(100, "Апельсины"));
        products.add(new Product(150, "Груши"));
        products.add(new Product(190, "Лимоны"));
        products.add(new Product(80, "Арбузы"));

        Shop shop = new Shop();
        shop.setProducts(products);

    }
}
