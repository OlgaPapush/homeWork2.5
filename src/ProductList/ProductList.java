package ProductList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProductList {
    public static Map<String getName,  int getPriceprice> productList = new HashMap<>();


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
