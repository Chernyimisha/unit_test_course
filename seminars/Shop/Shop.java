package seminars.Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;


    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice(List<Product> products) {
        // Допишите реализацию метода самостоятельно
        List<Product> result = new ArrayList<>();
        Product minProduct = products.get(0);

        for (int i = 0; i < products.size(); i++) {
            for (Product product : products) {
                if (product.getCost() <= minProduct.getCost()) {
                    minProduct = product;
                }
                result.add(minProduct);
            }
        }
        return result;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

}