package ProductList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    public static Set<Product> productList = new HashSet<>();

    public static void printListOfProduct() {
        System.out.println("Список");
        for (Product product : productList) ;
        {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб");
        }
    }
    public static void addProductToList(Product newProduct) {
        if (!productList.contains(newProduct)) {
            productList.add(newProduct);
        } else {
            throw new RuntimeException("Такой продукт уже существует");
        }
    }
}
