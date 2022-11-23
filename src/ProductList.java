import java.util.HashSet;
import java.util.Iterator;

public class ProductList {
    HashSet<Product> products = new HashSet<>();

    private void addProductToList(Product product) {

        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new RuntimeException();
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                addProductToList (Product product);
                break;
            }
        }
    }

    public void removeProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "products=" + products +
                '}';
    }
}
